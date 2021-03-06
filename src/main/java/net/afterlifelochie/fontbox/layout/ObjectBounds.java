package net.afterlifelochie.fontbox.layout;

public class ObjectBounds {

	public int x, y;
	public int width, height;
	public boolean floating;

	public ObjectBounds(int x, int y, int width, int height, boolean floating) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.floating = floating;
	}

	public boolean floating() {
		return floating;
	}

	public boolean intersects(ObjectBounds that) {
		boolean flag0 = (this.x < that.x + that.width && this.x + this.width > that.x);
		boolean flag1 = (this.y < that.y + that.height && this.y + this.height > that.y);
		return flag0 && flag1;
	}

	public boolean encloses(int x, int y) {
		boolean flag0 = (this.x < x && this.x + this.width > x);
		boolean flag1 = (this.y < y && this.y + this.height > y);
		return flag0 && flag1;
	}
}
