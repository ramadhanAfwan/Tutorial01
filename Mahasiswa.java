
public class Mahasiswa {
	public String namaMahasiswa;
	public int npm;
	
	public Mahasiswa(String namaMahasiswa, int npm) {
		super();
		this.namaMahasiswa = namaMahasiswa;
		this.npm = npm;
	}

	public String getNamaMahasiswa() {
		return namaMahasiswa;
	}

	public void setNamaMahasiswa(String namaMahasiswa) {
		this.namaMahasiswa = namaMahasiswa;
	}

	public int getNpm() {
		return npm;
	}

	public void setNpm(int npm) {
		this.npm = npm;
	}
	
	
}
