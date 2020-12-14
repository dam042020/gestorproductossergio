package org.jesuitasrioja.holamundo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.jesuitasrioja.holamundo.modelo.Producto;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController {

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
		// TODO
		return new Producto("1", "tomate", 1.30);
	}

	@GetMapping("/producto")
	public Producto getProducto2(@RequestParam String id) {
		// TODO
		return new Producto("1", "tomate", 1.30);
	}

	@PostMapping("/producto")
	public String postProducto(@RequestBody Producto nuevoProducto) {
		// TODO
		return "Aniadido: " + nuevoProducto.hashCode();
	}

	@PutMapping("/producto")
	public Producto putProducto(@RequestParam String id) { // TODO aniadir
		// TODO
		return null;
	}

	@DeleteMapping("/producto")
	public Producto deleteProducto() { // TODO aniadir
		// TODO
		return null;
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
