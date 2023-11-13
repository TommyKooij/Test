package nl.roc.testen.Hypotheektool;

import java.util.ArrayList;

public class ClientDB {
	
	ArrayList<Client> clients;
	
	public ArrayList<Client> InitializeClientsDB() {
		ArrayList<Client> clients = new ArrayList<Client>();
		
		clients.add(new Client(1, "James", "Madden", 9055, 6000));
		clients.add(new Client(2, "Sarah", "Collins", 8154, 5555));
		clients.add(new Client(3, "Jamm", "Cook", 6767, 7000));

		return clients;
	}

	public void AddClientToDB(Client client) {
		clients.add(client);
	}
	
	public void ShowClientDB(ArrayList<Client> clients) {
		System.out.println("");
		for (int i = 0; i < clients.size(); i++) {
			System.out.println(clients.get(i).firstName + " " + clients.get(i).lastName + ": €" + clients.get(i).currentBalance);
		}
	}
}
