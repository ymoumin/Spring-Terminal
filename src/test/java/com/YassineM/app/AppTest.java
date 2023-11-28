package com.YassineM.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@AutoConfigureJsonTesters
@WebMvcTest(TerminalController.class)
class AppTest {

	@Autowired
	private MockMvc mvc;


	@Test
	public void givenEnglishLanguage_thenReturnEnglishTerminal() throws Exception {
		//given
		String lg = "English";

		//when
		MockHttpServletResponse response = mvc.perform(MockMvcRequestBuilders
                .get("/terminal?lg="+lg)
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

		//then
		assertEquals(response.getStatus(),HttpStatus.OK.value());
		assertTrue(response.getContentAsString().contains("type=\"en\""));
	}

	@Test
	public void givenFrenchLanguage_thenReturnFrenchTerminal() throws Exception {
		//given
		String lg = "French";

		//when
		MockHttpServletResponse response = mvc.perform(MockMvcRequestBuilders
                .get("/terminal?lg="+lg)
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

		//then
		assertEquals(response.getStatus(),HttpStatus.OK.value());
		assertTrue(response.getContentAsString().contains("type=\"fr\""));
	}

}
