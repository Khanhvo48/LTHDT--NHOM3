package Pack;
public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;
    
    String getMonHoc() {
        return monHoc;
    }
    void setMonHoc(String monHoc){
        this.monHoc = monHoc;
    }
    String getCapDo() {
        return this.capDo;
    }
    void setCapDo(String capDo){
        this.capDo = capDo;
    }
    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }
    @Override
    public String toString() {
        return super.toString() +
                ", Mon hoc='" + this.monHoc + '\'' +
                ", Cap do='" + this.capDo + '\'' +
                '}';
    }
    public SachGiaoTrinh(){
        super();
    }
}
