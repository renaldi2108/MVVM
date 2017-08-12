package id.renaldirey.mvvm;

import android.databinding.BaseObservable;

public class ViewModelActivity extends BaseObservable {
    private String nama;
    private String status;

    public ViewModelActivity(String nama, String status){
        this.nama = nama;
        this.status = status;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
