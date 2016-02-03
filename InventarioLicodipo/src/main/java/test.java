import com.otv.model.Producto;
import com.otv.producto.dao.ProductoDAO;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto p = new Producto();
		p.setId(1);
		p.setNombre("sdsd");
		p.setPrecio(123);
		p.setDescripcion("asdjasldks");
		ProductoDAO dao= new ProductoDAO();
		dao.addProducto(p);
	}

}
