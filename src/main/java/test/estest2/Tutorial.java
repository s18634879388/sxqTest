package test.estest2;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/9/14.
 */
public class Tutorial implements Serializable{
    private Long id;
    private String name;//教程名称

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
