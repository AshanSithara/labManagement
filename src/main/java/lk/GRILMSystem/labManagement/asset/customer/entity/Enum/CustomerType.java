package lk.GRILMSystem.labManagement.asset.customer.entity.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CustomerType{
    INSIDE("Internal "),
    OUTSIDE("Out Side");

    private final String customerType;
}