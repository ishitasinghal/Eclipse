package com.training.First.service;

import org.springframework.stereotype.Service;

@Service
public class AdditionService {


public int add(int num1, int num2) {
	return(num1+num2);
}

public int sub(int numb1, int numb2) {
	return(numb1-numb2);
}

}
