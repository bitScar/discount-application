package com.application.discount.service;

import com.application.discount.domain.AmazonBaseline;
import com.application.discount.domain.AmazonBaselineCategory;
import com.application.discount.exception.ItemNotFoundException;
import com.application.discount.repository.AmazonBaselineCategoryRepository;
import com.application.discount.repository.AmazonBaselineRepository;
import com.application.discount.service.dto.AmazonClothDto;
import com.application.discount.service.dto.AmazonGameDto;
import com.application.discount.service.dto.ProductDetailDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@Transactional
public class AmazonGameService {


    @Autowired
    private AmazonBaselineRepository amazonBaselineRepository;

    @Autowired
    private AmazonBaselineCategoryRepository amazonBaselineCategoryRepository;

    public List<AmazonGameDto> getAllItems() {
        Set<String> gameCategoryIds = amazonBaselineCategoryRepository.findAllByCategory("Games")
            .stream()
            .map(AmazonBaselineCategory::getItemId)
            .collect(Collectors.toSet());
        List<AmazonBaseline> allItems = amazonBaselineRepository.findAll();
        return allItems.stream()
            .filter(item -> gameCategoryIds.contains(item.getId()))
            .map(amazonGame -> {
                AmazonGameDto dto = new AmazonGameDto();
                BeanUtils.copyProperties(amazonGame, dto);
                return dto;
            })
            .collect(Collectors.toList());
    }

    public ProductDetailDto getOneItem(String id) {
        AmazonBaseline oneItem = amazonBaselineRepository.findById(id)
            .orElseThrow(() -> new ItemNotFoundException(id));
        ProductDetailDto dto = new ProductDetailDto();
        BeanUtils.copyProperties(oneItem, dto);
        return dto;

    }
}

