package tnsif.c2tc.batch9.entity;
import javax.persistence.Entity;

@entity
public class student {
	@Id
	private int uid;
	private String name;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "student [uid=" + uid + ", name=" + name + "]";
	}

}
