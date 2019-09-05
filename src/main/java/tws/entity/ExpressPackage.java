package tws.entity;

import java.io.Serializable;

public class ExpressPackage implements Serializable {
    private String id;
    private String name;
    private String phone;
    private String status;
    private String date;

    public ExpressPackage() {
    }

    public ExpressPackage(String id, String name, String phone, String status, String date) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.status = status;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getStatus() {
        return status;
    }

    public String getDate() {
        return date;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ExpressPackage{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", status='" + status + '\'' +
                ", date='" + date + '\'' +
                '}';
    }


}
