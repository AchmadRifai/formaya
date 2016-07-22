/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.SQLException;

/**
 *
 * @author ai
 */
public class Usere {
    private String id,pass,nama;
    private boolean login,deleted,blocked;

    public Usere(String id,formaya.Db d) throws SQLException {
        this.id = id;
        java.sql.PreparedStatement ps=d.getPS("select*from usere where id=?");
        ps.setString(1, id);
        java.sql.ResultSet rs=ps.executeQuery();
        if(rs.next()){
            pass=rs.getString("pass");
            nama=rs.getString("nama");
            login=rs.getBoolean("login");
            deleted=rs.getBoolean("deleted");
            blocked=rs.getBoolean("blocked");
        }rs.close();
        ps.close();
    }

    public Usere(String id, String pass, String nama) {
        this.id = id;
        this.pass = pass;
        this.nama = nama;
        login=false;
        deleted=false;
        blocked=false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public boolean isLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
}