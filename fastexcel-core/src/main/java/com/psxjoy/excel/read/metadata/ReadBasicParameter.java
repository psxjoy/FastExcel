package com.psxjoy.excel.read.metadata;

import com.psxjoy.excel.metadata.BasicParameter;
import com.psxjoy.excel.read.listener.ReadListener;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@EqualsAndHashCode
public class ReadBasicParameter extends BasicParameter {

    private Integer headRowNumber;


    private List<ReadListener<?>> customReadListener;

    public ReadBasicParameter(){
        customReadListener = new ArrayList<>();
    }




}
