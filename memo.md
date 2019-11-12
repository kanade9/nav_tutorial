#  ハマったところメモ
### 受け取るほうについて
navargs()がunreferrenced errorになる→androidx.navigation.fragment.navArgsをインポートする  
viewに埋め込む値はそれぞれのフラグメントのxmlを参考にそのIDと合わせるようにする(Designから該当箇所のクリックで右上に表示されるID)

### 送る方について
基本的にはサイトの参考にすればいける。
引数を入力フォームから受け取る時はこれも同じようにxmlを参照にして割り振られたIDを利用する。そうしないとエラー出る。  

### その他
まずnavigation(今回はnav_graph.xml)でfragmentの中にargumentを定義する。これやらないといくら送る方、受け取る方で頑張ってもできない。  
argumentはもちろん渡したいデータの数だけ用意すること。  
argumentで追加した後、必ずReBuild Projectすること。これしないとクラスの自動生成などでバグが起こるらしい。
 
