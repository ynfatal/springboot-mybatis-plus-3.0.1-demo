package com.fatal.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * <p>
 * 通用枚举注入演示，注意需要实现 IEnums 也需要扫描枚举包
 * </p>
 *
 * @author: Fatal
 * @date: 2018/9/15 0015 14:35
 */
public enum AgeEnum implements IEnum<Integer> {
  ONE(1, "一岁"),
  TWO(2, "二岁"),
  THREE(3, "三岁");

  private int value;
  private String desc;

  AgeEnum(final int value, final String desc) {
    this.value = value;
    this.desc = desc;
  }

  @Override
  public Integer getValue() {
    return value;
  }
}
