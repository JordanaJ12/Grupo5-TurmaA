import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class menu {
	static int temp_dialog = 100, temp_narrativa = 10, temp_transicao = 25;

	public static void main(String[] args) throws Exception {
		Scanner entrada = new Scanner(System.in);
		Digita("O ano � 3050 e ap�s guerras a humanidade finalmente come�ou a desenvolver tecnologias para implantes corporais.",
				TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\nN�s da Full Body Tech somos pioneiros nesta revolucion�ria tecnologia.", TimeUnit.MILLISECONDS,
				temp_dialog);
		Digita("\nSeu objetivo? Deixar de ser humano e ser um dos mais respeitados VP's (Vice President) obtendo um dos nossos implantes e assim se tornar meio humano, \n meio rob�.",
				TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\nTemos dois dos mais avan�ados implantes!", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\nVoc� ser� desafiado!", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\nNo fim, somente seus resultados poder�o dizer se voc� ser� Tyger Fayol's, Valentinos Taylor's ou continuar� no mundo dos humanos vagando.",
				TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\nVoc� est� pronto?", TimeUnit.MILLISECONDS, temp_dialog);

		int escolha_menu;

		do {
			Digita("\n\n*** FULL BODY TECH *** \n\n1 - Jogar \n2 - Personagens\n3 - Cr�ditos \n4 - Sair",
					TimeUnit.MILLISECONDS, temp_transicao);
			System.out.println("\n");
			escolha_menu = entrada.nextInt();
			if (escolha_menu == 1) {
				jogo();
			} else if (escolha_menu == 2) {
				personagens();
			} else if (escolha_menu == 3) {
				creditos();
			} else if (escolha_menu == 4) {
				System.exit(0);
			} else {
				System.out.println("\nOp��o inv�lida, digite novamente: ");
			}
		} while (escolha_menu != 1 && escolha_menu != 2 && escolha_menu != 3 && escolha_menu != 4);

		entrada.close();
	}

	public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
		for (char caractere : mensagem.toCharArray()) {
			System.out.print(caractere);
			unit.sleep(tempo_mensagem);
		}
	}

	static void menu() throws Exception {
		Scanner entrada = new Scanner(System.in);
		int escolha_menu;

		do {
			Digita("\n\n*** FULL BODY TECH. *** \n\n1 - Jogar \n2 - Personagens\n3 - Cr�ditos \n4 - Sair",
					TimeUnit.MILLISECONDS, temp_transicao);
			System.out.println("\n");
			escolha_menu = entrada.nextInt();
			if (escolha_menu == 1) {
				jogo();
			} else if (escolha_menu == 2) {
				personagens();
			} else if (escolha_menu == 3) {
				creditos();
			} else if (escolha_menu == 4) {
				System.exit(0);
			} else {
				System.out.println("\nOp��o inv�lida, digite novamente: ");
			}
		} while (escolha_menu != 1 && escolha_menu != 2 && escolha_menu != 3 && escolha_menu != 4);

		entrada.close();
	}

	static void jogo() throws Exception {
		Scanner entrada = new Scanner(System.in);
		int escolha_menu, temp_narrativa = 100, cont_Fayol = 0, cont_Taylor = 0, perdeu = 0;
		String resposta;

		Digita(" \n   TRIIIIIIM! TRIIIIIM! TRIIIIIM!\n", TimeUnit.MILLISECONDS, temp_narrativa);
		Digita("\n   Toca o alarme no seu quarto, voc�, jogador, desliga sem muito �nimo e cansado das noites passadas, ap�s ter perdido o emprego em uma grande multinacional\n com o cargo"
				+ " de CIO (Chief Information Officer), onde gerenciava a infraestrutura tecnol�gica da empresa e cuidava do departamento de TI.\n   Agora? Ah...N�o passa de mais um desempregado"
				+ " em meio a muitos na atual sociedade, cercada de tecnologia e com modifica��es de chips e implantes artificiais\n pelo corpo, essa acaba sendo a nova maneira de sobreviver a esta realidade.",
				TimeUnit.MILLISECONDS, temp_narrativa);

		Digita("\n\n   Voc� ent�o se levanta, pega algo para comer e d� uma olhada nas not�cias corporativas do dia, percebendo que no topo das informa��es, h� algo que o chama\n muita aten��o,"
				+ " uma vaga para VP (Vice President) na maior corpora��o tecnol�gica j� existente, a FULL BODY TECH! A empresa mais capacitada e a maior\n produtora de chips e implantes corporais j� conhecida,"
				+ " tem centenas de ind�strias e v�rios investidores de alt�ssimos n�veis que pagam bilh�es para verem\n esta empresa lucrar ainda mais. Quem conseguir est� vaga, n�o apenas ser� t�o famoso e poderoso,"
				+ " como tamb�m ter� rios de dinheiros para sua vida toda e de\n suas pr�ximas gera��es... ",
				TimeUnit.MILLISECONDS, temp_narrativa);

		Digita("\n\n   Voc� n�o pensa duas vezes, e j� escaneia seu c�digo da nuca (todas as informa��es sobre voc� est�o contidas nele e n�o � mais necess�rio o uso de papel),\n afinal quem n�o quer se tornar"
				+ " o Vice president de uma corpora��o t�o poderosa? ", TimeUnit.MILLISECONDS, temp_narrativa);

		Digita("\n\n   Passado alguns dias voc� recebe a informa��o que seu perfil foi avaliado e considerado apto a participar das pr�ximas fases da t�o sonhada vaga, recebendo\n o local e o hor�rio para apresenta��o"
				+ " dos candidatos. ", TimeUnit.MILLISECONDS, temp_narrativa);

		Digita("\n\n   ALGUNS DIAS DEPOIS....", TimeUnit.MILLISECONDS, temp_narrativa);

		Digita("\n\n   Chegou o grande momento! � hora de ir ao lugar marcado, e n�o poderia deixar de ser na grande corpora��o, enorme, com in�meros andares, toda espelhada, \nrefletindo o poder que esta empresa tem entre o"
				+ " sucesso ou fracasso cruel de quem trabalha nela. Na grande recep��o voc� � direcionado a um grupo\nde outros candidatos (ou melhor, concorrentes) a vaga, alguns nervosos demais e que demonstram inexperi�ncia"
				+ " ao cargo, j� outros que est�o no mesmo n�vel\nque voc�, se n�o melhor, por isso TOME CUIDADO para n�o ser jogado para escanteio!",
				TimeUnit.MILLISECONDS, temp_narrativa);

		Digita("\n\n   Uma TR (Tech Recruiter) chega at� seu grupo e inicia seu discurso sobre a vaga:",
				TimeUnit.MILLISECONDS, temp_narrativa);

		Digita("\n   �Ol�, bem-vindos a Full Body Tech, sou respons�vel por mostrar a voc�s os setores da corpora��o e avis�-los que a parti do momento que decidirem continuar\n a candidatura, n�o poder�o desistir no meio do caminho."
				+ " Algu�m prefere n�o continuar?�", TimeUnit.MILLISECONDS, temp_narrativa);

		Digita("\n\n   Todos se entreolham, mas n�o mudam de opini�o e continuam. A recrutadora ent�o diz:",
				TimeUnit.MILLISECONDS, temp_narrativa);

		Digita("\n   ��timo! Primeiro, devo avis�-los sobre como funcionar� as pr�ximas fases.... os senhores passar�o por situa��es vivenciadas na corpora��o onde as decis�es\n e a��es de voc�s implicar� no �xito em conseguir est� vaga,"
				+ " ou falha da mesma e consequentemente sem chances para uma nova contrata��o em outro cargo da\n organiza��o. Estes desafios ser�o feitos durante uma semana e no final deste per�odo saber�o quem ser� o novo VP da Full Body"
				+ " Tech.\n   AH, ATEN��O! nem sempre ser�o avisados que est�o sendo testados, ent�o cuidado com seus movimentos. Enfim, vamos iniciar o tour pela corpora��o.�",
				TimeUnit.MILLISECONDS, temp_narrativa);

		Digita("\n\n   Durante o tour pela empresa, foi apresentado as �reas da organiza��o, voc�, candidato ent�o percebe que muitos trabalhadores executam seus servi�os de\n forma errada e que demora o dobro do tempo para serem realizadas."
				+ " Ent�o voc�:", TimeUnit.MILLISECONDS, temp_narrativa);

		Digita("\n\nA) Apenas deixar quieto, afinal ainda n�o come�ou a fase de testes ent�o se precisar resolver este tipo de problema, pensa em uma solu��o mais � frente.\r\n"
				+ "\nB) Comenta com o respons�vel pela apresenta��o, que percebeu este problema na empresa e sugeri que seria interessante analisar as atividades \ndestes funcion�rios e o tempo que levam para realizar cada "
				+ "opera��o. \r\n\nC) Analisa a situa��o e depois do tour decide conversar com a ger�ncia sobre a possibilidade de melhorar este problema incentivando o trabalho em equipe \ne colocando uma unidade de dire��o para cobrar"
				+ " os oper�rios a serem mais �geis nas atividades.\r\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
		resposta = entrada.next();

		switch (resposta.toUpperCase()) {
		case "A":
			Digita("\n   Na verdade, o tour pela empresa j� fazia parte dos testes e a demora na execu��o foi um problema colocado pela Full Body Tech, para verificar se seus \ncandidatos est�o atentos e preparados para gerenciar uma empresa"
					+ " de grande porte, assim voc� retrocedeu um passo de ser contratado pela empresa.",
					TimeUnit.MILLISECONDS, temp_narrativa);
			perdeu++;
			break;

		case "B":
			Digita("\n   O respons�vel passou a frente sobre a sua sugest�o e o pr�prio CEO concordou que sua an�lise seria uma �tima solu��o para a organiza��o, te dando o \nprimeiro ponto para a sua poss�vel contrata��o.",
					TimeUnit.MILLISECONDS, temp_narrativa);
			cont_Taylor++;
			break;

		case "C":
			Digita("\n   Sua ideia � recebida de bom grado na ger�ncia, sendo passada para o CEO da empresa que concordou com sua opini�o, considerando uma �tima solu��o \npara a organiza��o, te dando o primeiro ponto para a sua"
					+ " poss�vel contrata��o.", TimeUnit.MILLISECONDS, temp_narrativa);
			cont_Fayol++;
			break;
		}

		Digita("\n\n   Parece que nem todos foram bem neste primeiro desafio, alguns candidatos demonstram mais inquieta��o que antes, isso com certeza \nn�o � o perfil de um Vice president a altura desta corpora��o."
				+ " E para desespero destas pessoas, a Tech Recruiter, anuncia que o pr�prio CEO da empresa\n ir� tamb�m avaliar e supervisionar os candidatos durante as fases seguintes.",
				TimeUnit.MILLISECONDS, temp_narrativa);

		Digita("\n\n   Depois da apresenta��o e do primeiro teste aplicado os candidatos s�o dispensados e pedindo para retornarem no dia posterior para mais desafios.",
				TimeUnit.MILLISECONDS, temp_narrativa);

		switch (resposta.toUpperCase()) {
		case "A":
			Digita("\n\n   �h... para o primeiro dia n�o foi t�o bom assim, tome cuidado da pr�xima vez e tome iniciativas antes de n�o ter mais nenhuma chance.",
					TimeUnit.MILLISECONDS, temp_narrativa);
			break;

		case "B":
			Digita("\n\n   Olha s�! voc� n�o se saiu t�o ruim assim, mas vamos com calma esta foi apenas o primeiro dia, ainda lhe falta mais quatro dias at� o resultado e \ncom certeza ter�o testes mais desafiadores que este.",
					TimeUnit.MILLISECONDS, temp_narrativa);
			break;

		case "C":
			Digita("\n\n   Olha s�! voc� n�o se saiu t�o ruim assim, mas vamos com calma esta foi apenas o primeiro dia, ainda lhe falta mais quatro dias at� o resultado e \ncom certeza ter�o testes mais desafiadores que este.",
					TimeUnit.MILLISECONDS, temp_narrativa);
			break;

		}

		Digita("\n\n    NO DIA SEGUINTE... ", TimeUnit.MILLISECONDS, temp_narrativa);

		Digita("\n\n   Mais um dia na empresa e como dito anteriormente, o Diretor executivo participar� supervisionando alguns testes, como este. \r\n"
				+ "\n   O CEO, imagem da FULL BODY TECH, Poderoso e multimilion�rio faz a empresa render centenas de trilh�es ao ano, sobra-lhe dinheiro na conta, mas falta-lhe \nhumildade no seu interior. A ambi��o o move e � isso que"
				+ " ele procurar em seu novo VP.\r\n", TimeUnit.MILLISECONDS, temp_narrativa);

		Digita("\n   Ele se apresenta ao grupo de candidatos e de forma direta e sem rodeios j� apresenta o pr�ximo desafio que ter� que enfrentar: ",
				TimeUnit.MILLISECONDS, temp_narrativa);

		Digita("\n\n   �Eu como o CEO, exijo que aumentem a produtividade em 120% dos nano chips para implementa��o cibern�tica.�\r\n"
				+ "   Voc� sabe que isso n�o � tarefa f�cil, mas precisa tomar a��es. Voc� chega � linha de produ��o e: ",
				TimeUnit.MILLISECONDS, temp_narrativa);

		Digita("\n\nA) Observa toda rotina da linha de produ��o e toma como a��o cobrar mais trabalho dos oper�rios. Voc� observa que os funcion�rios est�o fazendo pouco e \nna sua metodologia, o pe�o tem que ralar. Os funcion�rios"
				+ " v�o considerar isso como um artif�cio para faz�-los trabalharem mais. O importante � entregar os 120%.\r\n"
				+ "\nB) V� a f�brica e nota que est� faltando organiza��o. Otimizando a estrutura da organiza��o, chegaria naturalmente a m�xima efic�cia de cada uma das partes.\n Cr� no aumento salarial e pensa em dar b�nus aos "
				+ "melhores funcion�rios. Rumo aos 120%.\r\n"
				+ "\nC) Nota que os funcion�rios est�o cansados e resolve dar o dia de folga para todos. Afinal, amanh� � um novo dia e com certeza v�o chegar descansados e \nprontos para cumprir o aumento de produtividade.\r\n\n",
				TimeUnit.MILLISECONDS, temp_narrativa);
		resposta = entrada.next();

		Digita("", TimeUnit.MILLISECONDS, temp_narrativa);

		switch (resposta.toUpperCase()) {
		case "A":
			Digita("\n\n   Seus subordinados foram a loucura com a sua primeira decis�o. Eles est�o trabalhando praticamente como escravos! Mas o aumento da \nremunera��o deles de acordo com a produtividade certamente "
					+ "nos trar� muitos lucros. Bom saber que no seu segundo desafio voc� se preocupou na metodologia.\n Seu pr�ximo desafio ser� voltado para o time de RH.",
					TimeUnit.MILLISECONDS, temp_narrativa);
			cont_Taylor++;
			break;

		case "B":
			Digita("\n\n   Voc� pensou muito bem no departamento como um todo. Bom saber que no seu segundo desafio voc� se preocupou na organiza��o. Isso \nmostra claramente seus conceitos. Seu pr�ximo desafio ser� voltado"
					+ " para o time de RH.", TimeUnit.MILLISECONDS, temp_narrativa);
			cont_Fayol++;
			break;

		case "C":
			Digita("\n\n   Voc� � maluco? Dar um dia de folga para todos os funcion�rios n�o foi legal. Espero que na sua pr�xima tarefa voc� tenha mais \ncuidado com a corpora��o, ela n�o perdoa erros. E seu pr�ximo desafio"
					+ " ser� voltado para nosso time de RH.", TimeUnit.MILLISECONDS, temp_narrativa);
			perdeu++;
			break;

		}

		Digita("\n\n   Ap�s a conclus�o do segundo desafio, o grande CEO pergunta a cada um dos candidados, incluive voc� jogador, sobre a administra��o da empresa. \n\r   �Hoje, vejo que nossa corpora��o est� sem comando. Nosso "
				+ "time de RH n�o � especializado em contratar gerentes, supervisores, coordenadores... \nPreciso que voc� me diga se � necess�rio ou n�o ter esta preocupa��o. Me diz: � ",
				TimeUnit.MILLISECONDS, temp_narrativa);

		Digita("\n\nA) �Sim, � necess�rio ter esta preocupa��o.�\r\n\nB) �N�o, n�o tem a menor necessidade.�\r\n",
				TimeUnit.MILLISECONDS, temp_narrativa);

		Digita(" ", TimeUnit.MILLISECONDS, temp_narrativa);

		if (cont_Taylor > 1) {
			Digita("\n\n   Parab�ns voc� ganhou a vaga t�o sonhada, se caracterizando com Taylor",
					TimeUnit.MILLISECONDS, temp_narrativa);
		} else if (cont_Fayol > 1) {
			Digita("\n\n   Parab�ns voc� ganhou a vaga t�o sonhada, se caracterizando com Fayol", TimeUnit.MILLISECONDS,
					temp_narrativa);
		} else if (perdeu > 1) {
			Digita("\n\n   Que horror! Voc� falhou miseravelmente e n�o � digno de se tornar um VP, V� para o olho da rua, AGORA!!",
					TimeUnit.MILLISECONDS, temp_narrativa);
		}

		do {
			System.out.println("\n\n0 - Menu Principal");
			escolha_menu = entrada.nextInt();
			if (escolha_menu == 0) {
				menu();
			} else {
				System.out.println("\nOp��o inv�lida, digite novamente: ");
			}
		} while (escolha_menu != 0);

		entrada.close();
	}

	static void personagens() throws Exception {
		Scanner entrada = new Scanner(System.in);
		int escolha_menu, temp_narrativa = 20;
		Digita("\n<<Tyger Fayol's>> nascido como Jules Henri Fayol, ap�s sofrer um grave acidente recebe um implante corporal.\n� um desenvolvedor que ajudou a tornar o movimento cibern�tico que � hoje. "
				+ "Ele � o principal desenvolvedor \nque deu origem aos primeiros implantes, e se tornou uma das figuras mais proeminentes na luta a favor da classe oper�ria.\n",
				TimeUnit.MILLISECONDS, temp_narrativa);
		Digita("\n<<Valentinos Taylor's>> nascido como Frederick Taylor, implantou em si mesmo um chip corporal criado por ele \npara aumentar o seu conhecimento e chegar ao topo da corpora��o.",
				TimeUnit.MILLISECONDS, temp_narrativa);
		do {
			System.out.println("\n\n0 - Menu Principal");
			escolha_menu = entrada.nextInt();
			if (escolha_menu == 0) {
				menu();
			} else {
				System.out.println("\nOp��o inv�lida, digite novamente: ");
			}
		} while (escolha_menu != 0);

		entrada.close();

	}

	static void creditos() throws Exception {
		Scanner entrada = new Scanner(System.in);
		int escolha_menu, temp_narrativa = 20;
		Digita("\n\n** Desenvolvedores **\n\n-> Gustavo Sousa \n-> Jordana Jesus \n-> Kleber Utrilha \n-> Lucas Alves \n-> Rafael Maieski",
				TimeUnit.MILLISECONDS, temp_narrativa);
		do {
			System.out.println("\n\n0 - Menu Principal");
			escolha_menu = entrada.nextInt();
			if (escolha_menu == 0) {
				menu();
			} else {
				System.out.println("\nOp��o inv�lida, digite novamente: ");
			}
		} while (escolha_menu != 0);

		entrada.close();
	}

}
