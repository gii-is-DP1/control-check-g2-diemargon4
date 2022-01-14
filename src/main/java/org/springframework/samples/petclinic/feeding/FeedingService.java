package org.springframework.samples.petclinic.feeding;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedingService {
	@Autowired
	FeedingRepository feedingRepository;
	
    public List<Feeding> getAll(){
    	List<Feeding> f = feedingRepository.findAll();
        return f;
    }

    public List<FeedingType> getAllFeedingTypes(){
        return null;
    }

    public FeedingType getFeedingType(String typeName) {
    	FeedingType f = feedingRepository.findFeedingType(typeName);
        return f;
    }

    public Feeding save(Feeding p) throws UnfeasibleFeedingException {
    	return null;
    }
    
    public List<FeedingType> findAllFeedingTypes(){
    	List<FeedingType> f = feedingRepository.findAllFeedingTypes();
		return f;
    }

	public void save2( Feeding feeding) {
		feedingRepository.save(feeding);
		
	}

    
}
