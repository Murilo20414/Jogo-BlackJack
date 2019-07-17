<h2>Projeto Black Jack</h2>

Projeto desenvolvido para a matérida de estrutura de dados I.

<h4>Como executar?</h4>

O projeto foi todo desenvolvido em Java, portanto é necessário que o Java 7+ esteja devidamente instalado na maquina. Para executá-lo é fundamental uma IDE de sua preferencias, basta abrir o arquivo como um pacote Java e executar por meio da Classe Jogo.java.

<h4>Como funciona?</h4>

O jogo segue um dos padrões do tradicional game Black Jack, e funciona sem uma interface gráfica.
No início do jogo, é entregue 2 cartas para cada jogador com outra virada na mesa e como não é possível que um dos jogadores atinja o valor máximo de 21 pontos, se faz necessário que passem para a próxima rodada. Na próxima rodada o Dealer (Classe responsável pela entrega de cartas Dealer.java) deixa uma carta sobre a mesa, obrigando os jogadores somarem as cartas da mão com a da mesa, agora podendo estourar ( >21 ) ou bater 21. Se mesmo assim algum jogador não estourar ou finalizar o jogo o Delaer vira a carta deixada na mesa e novamente fazendo com que os jogadores somem a nova cartas desvirada com a sua mão. O jogo pode não ser finalizado aí, se ainda houver jogadores com a pontuação menor que 21, o jogo continua com Dealer entregando mais cartas.

<h4>O que foi usado?</h4>

É fundamental que se tenha o JDK intalado, pois as funcionalidade e classes prontas dependem de alguns pacotes vinculados ao JDK.
