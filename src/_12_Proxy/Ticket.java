package _12_Proxy;

public class Ticket implements CinemaLib{
    private Integer id;
    private String title;
    private boolean status;

    public Ticket() {
    }

    public Ticket(Integer id, String title) {
        this.id = id;
        this.title = title;
        this.status = false;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Ticket #" + id + " "
                + (status ? "archived" : "not archived");
    }

    @Override
    public Boolean archiveTicket() {
        setStatus(!isStatus());
        return isStatus();
    }
}
