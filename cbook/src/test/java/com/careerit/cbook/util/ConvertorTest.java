package com.careerit.cbook.util;

import lombok.Data;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Data
class Sample{
    private String name;
    private String email;
}
@Data
class SampleDto{
    private String name;
    private String email;
}

@SpringBootTest
public class ConvertorTest {

    @Test
    void domainToDtoTest(){
        Sample sample = new Sample();
        sample.setName("Krish");
        sample.setEmail("krish.t@gmail.com");
        SampleDto sampleDto = Convertor.convert(sample, SampleDto.class);
        Assertions.assertEquals(sampleDto.getName(), sample.getName());
    }
    @Test
    void dtoToDomainTest(){
        SampleDto sampleDto = new SampleDto();
        sampleDto.setName("Krish");
        sampleDto.setEmail("krish.t@gmail.com");
        Sample sample = Convertor.convert(sampleDto, Sample.class);
        Assertions.assertEquals(sampleDto.getName(), sample.getName());
    }

}
