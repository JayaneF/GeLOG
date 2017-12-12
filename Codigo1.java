    int P, Q, R, T,neg, conj, dis, imp,bi, parentesesMinimo, parentesesMaximo, minP, minQ, minR, minT, maxP, maxQ, maxR, maxT, minNeg, minConj, minDis, minImp, minBi, maxNeg, maxConj, maxDis, maxImp, maxBi;
        String  conjPremissa="",parte1="", parte2="", parte3="", parte4="", parte5="", msgP="", msgQ="", msgR="", msgT="", conjOperadores="", conjLetras="", msgNeg="", msgDis="", msgConj="", msgImp="", msgBi="";
       //array para a quantidade max de itens escolhidos pelo usuário
        ArrayList<String> letras = new ArrayList<String>();
        ArrayList<String> operadores = new ArrayList<String>();
         ArrayList<String> novaListaMax = new ArrayList<String>();//com parenteses
         ArrayList<String> novaListaMax1 = new ArrayList<String>();
        
        
        //array para a quantidade min de itens escolhidos
        ArrayList<String> letrasMin = new ArrayList<String>();
        ArrayList<String> operadoresMin = new ArrayList<String>();
        ArrayList<String> novaListaMin = new ArrayList<String>();//com parenteses
        ArrayList<String> novaListaMin1 = new ArrayList<String>();
        
        //array para quantidade medianda de itens
        ArrayList<String> letrasMed = new ArrayList<String>();
        ArrayList<String> operadoresMed = new ArrayList<String>();
        
        ArrayList<String> opnegacaoMin = new ArrayList<String>();
        ArrayList<String> opnegacaoMax = new ArrayList<String>();
        
        ArrayList<String> premissa = new ArrayList<String>();
        
        ArrayList<String> parentesesMin = new ArrayList<String>();
        ArrayList<String> parentesesMax = new ArrayList<String>();
        
        ArrayList formulas = new ArrayList(letras.size()+ operadores.size());


        
        int contador=0;
        
        int contp = 0;
        int contq = 1;
        int contr = 1;
        int contt = 1;
        int contN = 1;
        int contC = 1;
        int contD = 1;
        int contI = 1;
        int contB = 1;
        int contminP=0;
        int contminQ=1;
        int contminR=1;
        int contminT=1;
        int contminN=1;
        int contminC=1;
        int contminD=1;
        int contminI=1;
        int contminB=1;
        
        
        int contadorP=0;
        int contadorQ=0;
        int contadorR=0;
        int contadorT=0;
        
        
        
        int contadorNeg=0;
        int contadorConj=0;
        int contadorDis=0;
        int contadorImp=0;
        int contadorBi=0;
        
        
        
        P=0;
        Q=0;
        R=0;
        T=0;
        neg = 0;
        conj = 0;
        dis=0;
        imp=0;
        bi=0;
        //Verificando letras selecionadas
        if(jRadioButtonP.isSelected()){
            //JOptionPane.showMessageDialog(null, "P está selecionado");
            P=1;
            msgP = "P-";
        }
        
        if(jRadioButtonQ.isSelected()){
             Q=1;
             msgQ = "Q-";
        }
        
        if(jRadioButtonR.isSelected()){
            R=1;   
            msgR="R-";
        }
        if(jRadioButtonT.isSelected()){
            T=1;
            msgT="T";
        }
        
        //Verificando operadores selecionados
        
        if(jRadioButtonNeg.isSelected()){
            neg=1;
            msgNeg="~";
        }
        if(jRadioButtonCon.isSelected()){
            conj=1;
            msgConj="^";
        }
        if(jRadioButtonDis.isSelected()){
            dis=1;
            msgDis="v";
            
        }
        if(jRadioButtonImp.isSelected()){
            imp=1;
            msgImp="->";
        }
        if(jRadioButtonBi.isSelected()){
            bi=1;
            msgBi="<->";
        }
            
        //f(jRadioButtonNeg.isSelected()){
        
    
        
        //CampoTeste.setText(msgP + msgQ + msgR + msgT);
        
       //Trabalhando com o indice que inicia de 0(zero); o indice será o numero de ocorrencia
        
        //Ocorrencias minimas das letras
        minP = jComboBoxMinP.getSelectedIndex();
        minQ = jComboBoxMinQ.getSelectedIndex();
        minR = jComboBoxMInR.getSelectedIndex();
        minT = jComboBoxMinT.getSelectedIndex();
        //Ocorrencias maxima das letras
        maxP = jComboBoxMaxP.getSelectedIndex();
        maxQ = jComboBoxMaxQ.getSelectedIndex();
        maxR = jComboBoxMaxR.getSelectedIndex();
        maxT = jComboBoxMaxT.getSelectedIndex();
        //Ocorrencias minimas dos operadores
        minNeg = jComboBoxMinNeg.getSelectedIndex();
        minConj = jComboBoxMinCon.getSelectedIndex();
        minDis = jComboBoxMinDis.getSelectedIndex();
        minImp = jComboBoxMinImp.getSelectedIndex();
        minBi = jComboBoxMinBi.getSelectedIndex();
        //Ocorrencias maximas dos operadores
        maxNeg = jComboBoxMaxNeg.getSelectedIndex();
        maxConj = jComboBoxMaxCon.getSelectedIndex();
        maxDis = jComboBoxMaxDis.getSelectedIndex();
        maxImp = jComboBoxMaxImp.getSelectedIndex();
        maxBi = jComboBoxMaxBI.getSelectedIndex();
        
        parentesesMinimo = jComboBoxQuantParentesesMin.getSelectedIndex();
        parentesesMaximo = jComboBoxQuantparentesesMax.getSelectedIndex();
        
        int contParentesesMin=0;
        int contParentesesMax=0;
        
        if((parentesesMaximo==0)||(parentesesMinimo==0)){
            System.out.print("Não haverá parenteses!");
        }
        //se o indice for um, adicione um par
        if(parentesesMaximo==1){
            parentesesMax.add("(");
            parentesesMax.add(")");
        }else if(parentesesMaximo==2){
            parentesesMax.add("(");
            parentesesMax.add(")");
            parentesesMax.add("(");
            parentesesMax.add(")");
        }else if(parentesesMaximo==3){
            parentesesMax.add("(");
            parentesesMax.add(")");
            parentesesMax.add("(");
            parentesesMax.add(")");
            parentesesMax.add("(");
            parentesesMax.add(")");
        }else if(parentesesMaximo==4){
            parentesesMax.add("(");
            parentesesMax.add(")");
            parentesesMax.add("(");
            parentesesMax.add(")");
            parentesesMax.add("(");
            parentesesMax.add(")");
            parentesesMax.add("(");
            parentesesMax.add(")");
            
        }
        
        
        //Adicionando as letras ao array que será sorteado.
        //se for selecionado recebe 1
        //enquanto o contador for menor ou igual  a quantidade max
      if(P==1){
          
          if(minP==0 && maxP == 0 ){
              JOptionPane.showMessageDialog(null, "Se selecionou P, escolhe ao menos 1 na quantidade +"
                      + " mínima e máxima!");
          }else{
           while(contp<maxP){
               letras.add("P");
               contp++;
           }
           
           
           while(contminP<minP){
               letrasMin.add("P");
               contminP++;
               
           }}
           
       } 
       
       if(Q==1){
           if(maxQ == 0 && minQ == 0){
              JOptionPane.showMessageDialog(null, "Se selecionou Q, escolhe ao menos 1 na quantidade +"
                      + " mínima e máxima!");
          }
          else{
           while(contq<=maxQ){
               letras.add("Q");
               contq++;
           }
           while(contminQ<=minQ){
               letrasMin.add("Q");
               contminQ++;
               
           }
           
       } }
       
       if(R==1){
           if(minR==0 && maxR == 0 ){
              JOptionPane.showMessageDialog(null, "Se selecionou R, escolhe ao menos 1 na quantidade +"
                      + " mínima e máxima!");
          }
          else{
           while(contr<=maxR){
               letras.add("R");
               contr++;
           }
           while(contminR<=minR){
               letrasMin.add("R");
               contminR++;
               
           }
           
       }}
       
      if(T==1){
          
          if(maxT == 0 && minT == 0){
              JOptionPane.showMessageDialog(null, "Se selecionou T, escolhe ao menos 1 na quantidade +"
                      + " mínima e máxima!");
          }
          else{
           while(contt<=maxT){
               letras.add("T");
               contt++;
           }
           while(contminT<=minT){
               letrasMin.add("T");
               contminT++;
               
           }
           
       }}
      //adicionando os operadores de acordo com a quantidade max
      
       if(neg==1){
           if(maxNeg == 0 && minNeg == 0){
              JOptionPane.showMessageDialog(null, "Se selecionou a negação, escolhe ao menos 1 na quantidade +"
                      + " mínima e máxima!");
          }
          else{
           while(contN<=maxNeg){
               opnegacaoMax.add("~");
               contN++;
           }
            while(contminN<=minNeg){
               opnegacaoMin.add("~");
               contminN++;
           }
           
       } }
       
       if(conj==1){
           if(maxConj == 0 && minConj == 0){
              JOptionPane.showMessageDialog(null, "Se selecionou a conjunção, escolha ao menos 1 na quantidade +"
                      + " mínima e máxima!");
          }
          else{
           while(contC<=maxConj){
               operadores.add("^");
               contC++;
           }
           while(contminC<=minConj){
               operadoresMin.add("^");
               contminC++;
           }
           
       } }
       
       if(dis==1){
           if(maxDis == 0 && minDis == 0){
              JOptionPane.showMessageDialog(null, "Se selecionou a disjunção, escolha ao menos 1 na quantidade +"
                      + " mínima e máxima!");
          }
          else{
           while(contD<=maxDis){
               operadores.add("v");
               contD++;
           }
           while(contminD<=minDis){
               operadoresMin.add("v");
               contminD++;
           }
           
       }}
       
      if(imp==1){
          if(maxImp == 0 && minImp == 0){
              JOptionPane.showMessageDialog(null, "Se selecionou a implicação, escolha ao menos 1 na quantidade +"
                      + " mínima e máxima!");
          }
          else{
           while(contI<=maxImp){
               operadores.add("->");
               contI++;
           }
           while(contminI<=minImp){
               operadoresMin.add("->");
               contminI++;
           }
       } }
      
      if(bi==1){
          if(maxBi == 0 && minBi == 0){
              JOptionPane.showMessageDialog(null, "Se selecionou a bi-implicação, escolhe ao menos 1 na quantidade +"
                      + " mínima e máxima!");
          }
          else{
          while(contB<=maxBi){
              operadores.add("<->");
              contB++;
          }
          while(contminB<=minBi){
               operadoresMin.add("<->");
               contminB++;
           }
      } }
      
    
    //
      //---------Itens com quantidade minima---------------
      
       Collections.shuffle(letrasMin);
       System.out.print(letrasMin.toString());       
       Collections.shuffle(operadoresMin);
       System.out.print(operadoresMin.toString());
       
       System.out.println(opnegacaoMin.toString());
      
       
       //----------------Formula sem parenteses com quantidade minima
       
       int l = 0;

    int quantidadeDeNegacao2 = opnegacaoMax.size();

    while(l < letrasMin.size() - 1) { // não vai até o final do array de letras, pq os operadores tem sempre -1
	String nome6 = letrasMin.get(l);
	String nome7 = operadoresMin.get(l);
//se houver negação
	if(quantidadeDeNegacao2 > 0){
		int quantidadeDeLetras2 = letrasMin.size() - l;//quantas letras disponiveis para inserir a neg
                //probabilidade de adc
		boolean adicionaNegacao2 = new Random().nextFloat() <= quantidadeDeNegacao2 / quantidadeDeLetras2;

		if(adicionaNegacao2) {
			novaListaMin.add("~");//add negação
			quantidadeDeNegacao2--;
		}	
	}
	novaListaMin.add(nome6); //letra
	novaListaMin.add(nome7); //operador
	l++;
}

// Se sobrou uma negação adiciona
     if(quantidadeDeNegacao2 > 0) {
	novaListaMin.add("~");
     } 
//estava pegando a posição com zero e ñão havia condições pra ela
// ai gora adiciona a última letra que fico
     if(l != 0){
    String nome8 = letrasMin.get(l);
    novaListaMin.add(nome8);}
       
    String item6="";
    
    for(int j=0; j<novaListaMin.size(); j++){
        item6 = item6 + novaListaMin.get(j);
    } 
       
     
            //-------------------------------------Formula completa com quantidade min--------------- 
            Collections.shuffle(letrasMin);
           // System.out.print(letrasMin.toString());       
            Collections.shuffle(operadoresMin);
           // System.out.print(operadoresMin.toString());
    
                int r = 0;
		Random rnd1 = new Random();
		int quantidadeDeNegacao3 = opnegacaoMin.size();
		int quantidadeDeParenteses3 = parentesesMin.size() / 2;
		boolean parentesesAdicionado3 = false;
                
                
                
                    while (r < letrasMin.size() - 1) { // não vai até o final do array de
										// letras, pq os operadores tem sempre
										// -1
			String nome7 = letrasMin.get(r);
			String nome9 = operadoresMin.get(r);

			boolean adicionarParenteses3 = false;
			
			if (quantidadeDeParenteses3 > 0 && !parentesesAdicionado3) {
				int quantidadeDeOperadores3 = operadoresMin.size();
				adicionarParenteses3 = rnd1.nextFloat() <= (quantidadeDeOperadores3 - 1) / quantidadeDeParenteses3;
			}

			boolean adicionaNegacao3 = false;
			if (quantidadeDeNegacao3 > 0) {
				int quantidadeDeLetras3 = letrasMin.size() - r;
				// adc aleatoriamente onde vai ter negacao
				adicionaNegacao3 = rnd1.nextFloat() <= quantidadeDeNegacao3 / quantidadeDeLetras3;
			}
			
			
			if(adicionarParenteses3) {
				if(adicionaNegacao3) {
					if(rnd1.nextFloat() > 0.5) {
						novaListaMin1.add("(");
						adicionarParenteses3 = false;
					}
					novaListaMin1.add("~");
					quantidadeDeNegacao3--;
				}
				
				if(adicionarParenteses3) {
					novaListaMin1.add("(");
				}
				adicionarParenteses3 = false;
				novaListaMin1.add(nome7);
				novaListaMin1.add(nome9);
				parentesesAdicionado3 = true;
			} else {
				if(adicionaNegacao3) {
					novaListaMin1.add("~");
					quantidadeDeNegacao3--;
				}
				
				novaListaMin1.add(nome7);
				if (parentesesAdicionado3) {
					novaListaMin1.add(")");
					parentesesAdicionado3 = false;
				}
				novaListaMin1.add(nome9);
				
			}

			r++;
		}

		// Se sobrou uma negação adiciona
		if (quantidadeDeNegacao3 > 0) {
			novaListaMin1.add("~");
		}

		// agora adiciona a última letra que ficou
                if(r != 0){
		String nome10 = letrasMin.get(r);
		novaListaMin1.add(nome10);}
                
                if(parentesesAdicionado3){
			novaListaMin1.add(")");
                }
    
		String item7= "";

		for (int s = 0; s < novaListaMin1.size(); s++) {
			item7 = item7 + novaListaMin1.get(s);
                      //  System.out.print(item);
		}
                
                     //---------------------------------------------------------------------------
       
      
    
    
    //-----------------------Itens MAX--------------------------------
       //embaralhando as letras e os arrays Max
       Collections.shuffle(letras);
      //System.out.print(letras.toString());       
       Collections.shuffle(operadores);
      // System.out.print(operadores.toString());
       
       System.out.println(opnegacaoMax.toString());
      //-------------Formula sem parenteses com quantidades max-------------------------------
       int i = 0;

    int quantidadeDeNegacao1 = opnegacaoMax.size();

    while(i < letras.size() - 1) { // não vai até o final do array de letras, pq os operadores tem sempre -1
	String nome3 = letras.get(i);
	String nome4 = operadores.get(i);

	if(quantidadeDeNegacao1 > 0){
		int quantidadeDeLetras = letras.size() - i;
                //adc aleatoriamente onde vai ter negacao
		boolean adicionaNegacao1 = new Random().nextFloat() <= quantidadeDeNegacao1 / quantidadeDeLetras;

		if(adicionaNegacao1) {
			novaListaMax1.add("~");
			quantidadeDeNegacao1--;
		}	
	}
	novaListaMax1.add(nome3);
	novaListaMax1.add(nome4);
	i++;
}

// Se sobrou uma negação adiciona
     if(quantidadeDeNegacao1 > 0) {
	novaListaMax1.add("~");
     } 

// agora adiciona a última letra que ficou
     if(i != 0){
    String nome5 = letras.get(i);
    novaListaMax1.add(nome5);}
       
    String item1="";
    
    for(int j=0; j<novaListaMax1.size(); j++){
        item1 = item1 + novaListaMax1.get(j);
    }
    
    
         Collections.shuffle(letras);
         System.out.print(letras.toString());       
         Collections.shuffle(operadores);
         System.out.print(operadores.toString());   
     
     //-------------------------------------Formula completa com quantidade max--------------- 
                int k = 0;
		Random rnd = new Random();
		int quantidadeDeNegacao = opnegacaoMax.size();
		int quantidadeDeParenteses = parentesesMax.size() / 2;
		boolean parentesesAdicionado = false;
                
                
                
                    while (k < letras.size() - 1) { // não vai até o final do array de
										// letras, pq os operadores tem sempre
										// -1
			String nome1 = letras.get(k);
			String nome2 = operadores.get(k);

			boolean adicionarParenteses = false;
			
			if (quantidadeDeParenteses > 0 && !parentesesAdicionado) {
				int quantidadeDeOperadores = operadores.size();
				adicionarParenteses = rnd.nextFloat() <= (quantidadeDeOperadores - 1) / quantidadeDeParenteses;
			}

			boolean adicionaNegacao = false;
			if (quantidadeDeNegacao > 0) {
				int quantidadeDeLetras = letras.size() - k;
				// adc aleatoriamente onde vai ter negacao
				adicionaNegacao = rnd.nextFloat() <= quantidadeDeNegacao / quantidadeDeLetras;
			}
			
			
			if(adicionarParenteses) {
				if(adicionaNegacao) {
					if(rnd.nextFloat() > 0.5) {
						novaListaMax.add("(");
						adicionarParenteses = false;
					}
					novaListaMax.add("~");
					quantidadeDeNegacao--;
				}
				
				if(adicionarParenteses) {
					novaListaMax.add("(");
				}
				adicionarParenteses = false;
				novaListaMax.add(nome1);
				novaListaMax.add(nome2);
				parentesesAdicionado = true;
			} else {
				if(adicionaNegacao) {
					novaListaMax.add("~");
					quantidadeDeNegacao--;
				}
				
				novaListaMax.add(nome1);
				if (parentesesAdicionado) {
					novaListaMax.add(")");
					parentesesAdicionado = false;
				}
				novaListaMax.add(nome2);
				
			}

			k++;
		}

		// Se sobrou uma negação adiciona
		if (quantidadeDeNegacao > 0) {
			novaListaMax.add("~");
		}

		// agora adiciona a última letra que ficou
                if( k !=0){
		String nome1 = letras.get(k);
		novaListaMax.add(nome1);}
                
                if(parentesesAdicionado){
			novaListaMax.add(")");
                }
    
		String item = "";

		for (int m = 0; m < novaListaMax.size(); m++) {
			item = item + novaListaMax.get(m);
                      //  System.out.print(item);
		}
                
                
    //----------------------------------------------------------------------------------------            
               formulas.add(item6);
               formulas.add(item7);
               formulas.add(item);
               formulas.add(item1);
                
                
                String formula ="";
                for(int g=0; g<formulas.size(); g++){
                    formula = formula + formulas.get(g) + "\n";                 
                }
                System.out.println("1. Desenvolva a tabela verdade das fórmulas abaixo: ");
                System.out.println(formula);
       
              //CampoTeste.setText("Formula1: " + item6 + "FormulaMinParenteses:" + item7);    
   
      
             
       


