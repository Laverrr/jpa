package com.laver.dao;

import com.laver.domain.ResidentEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by L on 2018/6/8.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ResidentRepositoryTest {

    @Autowired
    private ResidentRepository residentRepository;

    @Test
    public void save(){
        ResidentEntity residentEntity = new ResidentEntity();
        residentEntity.setName("C");
        residentEntity.setAge(21);
        residentEntity.setGender("1");
        residentEntity.setPhone("13229005555");
        residentEntity.setRelation(1);
        residentEntity.setStatus(0);
        residentEntity.setFamilyId(1);
        residentEntity.setRemark("小可爱");
        residentRepository.save(residentEntity);
    }

    @Test
    public void delete(){
        residentRepository.deleteById(7);
    }


}