package br.instituto.negocio.cadastro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataNegocio {
	
	public static Date formatarData(String data) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		try {
			date = sdf.parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
}
