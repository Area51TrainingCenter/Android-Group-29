package pe.area51.listandcontent;

/**
 * Created by alumno on 12/23/16.
 */

public class Note {

    private long id;
    private String title;
    private String content;
    private long creationTimestamp;

    public Note() {
        this.creationTimestamp = -1;
        this.id = -1;
        this.title = "";
        this.content = "";
    }

    public long getId() {
        return id;
    }

    public Note setId(long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Note setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Note setContent(String content) {
        this.content = content;
        return this;
    }

    public long getCreationTimestamp() {
        return creationTimestamp;
    }

    public Note setCreationTimestamp(long creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", creationTimestamp=" + creationTimestamp +
                '}';
    }
}
