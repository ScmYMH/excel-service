package com.scm.contract.excel.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ImportValiDto {
    private String cntrt_id; //계약Id
    private Integer trff_id; //타리프Id
}
