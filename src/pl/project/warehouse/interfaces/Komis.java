package pl.project.warehouse.interfaces;

import javax.ejb.Local;
import java.util.List;

import pl.project.warehouse.entities.Car;

@Local
public interface Komis {

	public abstract String create(Car car);

	public abstract Car find(int idc);

	public abstract List<Car> get();

	public abstract String update(Car car);

	public abstract void delete(int idc);

}