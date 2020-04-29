package org.feng.pattern.builder;

/**
 * 抽象建造者
 *
 * @author Feng
 * @date 2020/4/29 12:41
 */
public abstract class AbstractBuilder {
    protected Product product;

    public AbstractBuilder(){
        this.product = new Product();
    }
    /**构建A*/
    public abstract void buildPartA();
    /**构建B*/
    public abstract void buildPartB();
    /**构建C*/
    public abstract void buildPartC();

    /**
     * 获得产品
     * @return 产品对象
     */
    public Product getResult(){
        return product;
    }
}
