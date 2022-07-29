package com.fastcampus.ch3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TxService {
    @Autowired A1Dao a1Dao;
    @Autowired B1Dao b1Dao;
}
