# 详细参数介绍

## 常见类

* EasyExcel 入口类，用于构建开始各种操作
* ExcelReaderBuilder ExcelWriterBuilder 构建出一个 ReakWorkBook 和 WriteWorkBook ，可以理解成一个 excel 对象， 一个excel
  只需要创建一个
* ExcelReaderSheetBuilder ExcelWriterSheetBuilder 构建出一个 ReadSheet 和 WriteSheet，可以理解成 excel 里面的一页，每一页都要构建一个
* ReadListener 在每一行读取完毕后都会调用 ReaderListener 来处理数据
* WriteHandler 在每一个操作（包括创建单元格、创建表格等）都会调用WriteHandler 来处理数据
* 所有的配置都是继承的。WorkBook的配置会被 sheet继承，所以在用EasyExcel设置参数的时候，在 easyexcel...sheet()
  方法之前作用域是整个sheet，之后针对单个sheet。

## 读
### 注解

### 参数

#### 通用参数

#### ReadWorkbook(理解成excel对象)参数

#### ReadSheet(理解成excel的sheet页)参数


## 写
### 注解

### 参数

#### 通用参数

#### WriteWorkBook（理解成excel对象）参数

#### WriteSheet(理解成excel的sheet页)参数

#### WriteTable（就把excel的一个Sheet,一块区域看一个table）参数