package guru.springframework.spring6resttemplate.client;

import guru.springframework.spring6resttemplate.model.BeerDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;

public interface BeerClient {

    Page<BeerDTO> listBeers();
}
