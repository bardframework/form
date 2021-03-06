package org.bardframework.form.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public class FormField implements Comparable<FormField> {
    private String name;
    private String type;
    private List<Option> options;
    private String value;
    private String label;
    private String placeholder;
    private String tooltip;
    private String regex;
    private String mask;
    private String prefix;
    private String suffix;
    private Integer maxLength;
    private Long minValue;
    private Long maxValue;
    private boolean disable;
    private boolean required;
    private boolean showInTable;
    private String errorMessage;
    @JsonIgnore
    private int order;

    public FormField() {
    }

    public FormField(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    public String getTooltip() {
        return tooltip;
    }

    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public boolean isDisable() {
        return disable;
    }

    public void setDisable(boolean disable) {
        this.disable = disable;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public boolean isShowInTable() {
        return showInTable;
    }

    public void setShowInTable(boolean showInTable) {
        this.showInTable = showInTable;
    }

    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public Long getMinValue() {
        return minValue;
    }

    public void setMinValue(Long minValue) {
        this.minValue = minValue;
    }

    public Long getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Long maxValue) {
        this.maxValue = maxValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FormField formField = (FormField) o;

        if (!name.equals(formField.name)) return false;
        return type.equals(formField.type);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + type.hashCode();
        return result;
    }

    @Override
    public int compareTo(FormField other) {
        return Integer.compare(this.order, other.order);
    }

    @Override
    public String toString() {
        return "FormField{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", options=" + options +
                ", value='" + value + '\'' +
                ", label='" + label + '\'' +
                ", placeholder='" + placeholder + '\'' +
                ", tooltip='" + tooltip + '\'' +
                ", regex='" + regex + '\'' +
                ", mask='" + mask + '\'' +
                ", maxLength=" + maxLength +
                ", required=" + required +
                ", showInTable=" + showInTable +
                ", errorMessage='" + errorMessage + '\'' +
                ", order=" + order +
                '}';
    }
}
