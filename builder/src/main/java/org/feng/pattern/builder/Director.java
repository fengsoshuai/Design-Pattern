package org.feng.pattern.builder;

/**
 * 指挥器
 *
 * @author Feng
 * @date 2020/4/29 12:50
 */
public class Director {
    private AbstractBuilder builder;

    public Director(AbstractBuilder builder) {
        this.builder = builder;
    }

    public void setBuilder(AbstractBuilder builder){
        this.builder = builder;
    }

    /**
     * 组装建造者
     * @return Product
     */
    public Product construct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();

        return builder.getResult();
    }
}
