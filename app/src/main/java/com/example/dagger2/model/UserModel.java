package com.example.dagger2.model;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserModel implements Serializable, Parcelable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("email")
    @Expose
    private String email;

    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("website")
    @Expose
    private String website;

    public final static Parcelable.Creator<UserModel> CREATOR = new Creator<UserModel>() {


        @SuppressWarnings({
                "unchecked"
        })
        public UserModel createFromParcel(Parcel in) {
            return new UserModel(in);
        }

        public UserModel[] newArray(int size) {
            return (new UserModel[size]);
        }

    }
            ;
    private final static long serialVersionUID = 1768687626394876276L;

    protected UserModel(Parcel in) {
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.username = ((String) in.readValue((String.class.getClassLoader())));
        this.email = ((String) in.readValue((String.class.getClassLoader())));

        this.phone = ((String) in.readValue((String.class.getClassLoader())));
        this.website = ((String) in.readValue((String.class.getClassLoader())));

    }

    /**
     * No args constructor for use in serialization
     *
     */
    public UserModel() {
    }

    /**
     *
     * @param id
     * @param phone
     * @param username
     * @param website
     * @param email
     * @param name
     */
    public UserModel(Integer id, String name, String username, String email, String phone, String website) {
        super();
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;

        this.phone = phone;
        this.website = website;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }



    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(name);
        dest.writeValue(username);
        dest.writeValue(email);
        dest.writeValue(phone);
        dest.writeValue(website);

    }

    public int describeContents() {
        return 0;
    }

}