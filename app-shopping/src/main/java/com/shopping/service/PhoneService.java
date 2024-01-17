package com.shopping.service;

import com.shopping.entity.PhoneModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PhoneService {

    PhoneModel savePhone(PhoneModel data);

    List<PhoneModel> savePhones(List<PhoneModel> data);
}
