package org.jesuitasrioja.holamundo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.jesuitasrioja.holamundo.modelo.Producto;
import org.jesuitasrioja.holamundo.repository.IProductosRepository;
import org.jesuitasrioja.holamundo.repository.ProductosRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class ProductoController {

	private IProductosRepository pr = new ProductosRepository();

	// Toda la lista productos BBDD
	@GetMapping("/productos")
	public List<Producto> allProducts() {
		// TODO implementar desde persistencia
		List<Producto> listaProductos = new ArrayList<Producto>();

		listaProductos.add(new Producto("1", "tomate", 1.30));
		listaProductos.add(new Producto("2", "patata", 0.50));
		listaProductos.add(new Producto("3", "aguacate", 3.00));

		return listaProductos;
	}

	@GetMapping("/producto/{id}")
	public Producto getProducto(@PathVariable String id) {
		return pr.getById(id);
	}

	@GetMapping("/producto")
	public Producto getProducto2(@RequestParam String id) {
		return pr.getById(id);
	}

	@PostMapping("/producto")
	public String postProducto(@RequestBody Producto nuevoProducto) {
		// TODO
		return String.valueOf(pr.aniadirProducto(nuevoProducto));
	}

	@PutMapping("/producto")
	public Producto putProducto(@RequestParam String id) { // TODO aniadir
		// TODO
		return null;
	}

	@DeleteMapping("/producto/{id}")
	public String deleteProducto(@PathVariable String id) { // TODO aniadir
		// TODO
		return String.valueOf(pr.eliminarProducto(id));
	}

//	@GetMapping("/saludos/{nombre}")
//	public String getSaludo2(@PathVariable String nombre) {
//		return "Hola " + nombre;
//	}

//	@GetMapping("/saludos/{nombre}")
//	public String getSaludo(@PathVariable String nombre) {
//		return "Hola " + nombre;
//	}

//	@GetMapping("/saludos")
//	public String getSaludo(@RequestParam String nombre) {
//		return "Hola " + nombre;
//	}
//
//	@PostMapping("/saludos")
//	public String postSaludo(@RequestBody String cuerpo) {
//		return "Hola Mundo con Post " + cuerpo;
//	}
//
//	@DeleteMapping("/saludos")
//	public String deleteSaludo() {
//		return "Hola Mundo con Delete";
//	}
//
//	@PutMapping("/saludos")
//	public String putSaludo() {
//		return "Hola Mundo con Put";
//	}

}
