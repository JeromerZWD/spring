package entity;

import org.springframework.stereotype.Component;

@Component
public class User {
    private String name;
    private String content;

    public User() { }

    public User(String name, String content) {
        this.name = name;
        this.content = content;
    }
    public void talk(){
        System.out.println(this.name+"说："+this.content);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
