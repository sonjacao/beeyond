package at.htl.beeyond.entity;

import javax.persistence.Entity;
import javax.persistence.Lob;

@Entity
public class CustomApplication extends Application {

    @Lob
    private String content;

    public CustomApplication(String note, User owner, String content) {
        super(note, owner);
        this.content = content;
    }

    public CustomApplication() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
