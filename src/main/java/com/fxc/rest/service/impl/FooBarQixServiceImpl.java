package com.fxc.rest.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.fxc.rest.common.Utils;
import com.fxc.rest.service.FooBarQixService;

@Service
public class FooBarQixServiceImpl implements FooBarQixService {

	@Override
	public String computeString(Integer number) {
		String result = addModulo(number) + addOccur(number, false);
        return !StringUtils.hasLength(result) ? String.valueOf(number) : result;
	}

	@Override
	public String computeStringV2(Integer number) {
		// this next line allow us to if there is [foo | bar | qix] in the result
		String result = addModulo(number) + addOccur(number, false);
		return StringUtils.hasLength(result) ?  addModulo(number) + addOccur(number, true) : Utils.replace0(number);
	}

	private static String addModulo(int number) {
        String result = "";
        if (Utils.isModulo(number, 3)) {
            result = Utils.addFoo(result);
        }
        if (Utils.isModulo(number, 5)) {
            result = Utils.addBar(result);
        }
        if (Utils.isModulo(number, 7)) {
            result = Utils.addQix(result);
        }
        return result;
    }
    
    private static String addOccur(int number, boolean isV2) {
        String result = "";
        for (char digit : String.valueOf(number).toCharArray()) {
            switch(digit) {
            	case '0':
            		result = isV2 ? Utils.addStar(result) : result;
            		break;
                case '3': 
                    result = Utils.addFoo(result);
                    break;
                case '5':
                    result = Utils.addBar(result);
                    break;
                case '7':
                    result = Utils.addQix(result);
                    break;
                default:
                    break;
            }
        }
        return result;
    }

}
