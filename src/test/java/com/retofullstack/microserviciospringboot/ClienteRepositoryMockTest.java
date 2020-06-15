package com.retofullstack.microserviciospringboot;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.retofullstack.microserviciospringboot.entity.Cliente;
import com.retofullstack.microserviciospringboot.repository.ClienteRepository;

@DataJpaTest
public class ClienteRepositoryMockTest {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Test
	public void cuandoEncuentraClientes_EntoncesRetornaListClientes() {
		List<Cliente> founds = clienteRepository.findAll();
		
		Assertions.assertThat(founds.size()).isEqualTo(5);
	}

}