/*
package com.application.discount;

import com.application.discount.service.AmazonSearchService;
import com.application.discount.service.dto.AmazonSearchDto;
import io.searchbox.client.JestClient;
import io.searchbox.core.Index;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectTests {
    @Autowired
    AmazonSearchService amazonSearchService;
    @Autowired
    JestClient jestClient;

    @Test
    public void contextLoads() throws IOException {
        //SearchParamDto searchParamDto = new SearchParamDto();
        //searchParamDto.setKeyword("big dreams");
       // put();
        System.out.println(amazonSearchService.getlist("big dreams"));
    }

    /*
    public void put() throws IOException{
        //get data from database
        List<AmazonSearchDto> searchList = amazonSearchService.getAllItems();
        // add to es
        for(AmazonSearchDto itemInfo: searchList){
            Index put = new Index.Builder(itemInfo).index("amazon-search03").type("_doc").id(itemInfo.getId()+"").build();
            jestClient.execute(put);
        }
    }
    */
/*
}
*/
