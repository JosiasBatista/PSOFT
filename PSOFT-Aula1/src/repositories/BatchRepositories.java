package repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import store.Batch;

public class BatchRepositories {

	private Map<String, Batch> batches;
	
	public void create(String id, Batch batch) {
		this.batches.put(id, batch);
	}
	
	public Batch read(String id) {
		return this.batches.get(id);
	}
	
	public void update(String id, Batch batch) {
		this.batches.put(id, batch);
	}
	
	public void delete(String id) {
		this.batches.remove(id);
	}
	
	public List<Batch> getAll() {
		return new ArrayList<>(this.batches.values());
	}
}
