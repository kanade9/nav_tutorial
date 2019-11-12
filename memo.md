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
 
### 参考サイト
値渡し  
https://techblog.zozo.com/entry/android-jetpack-navigation  
ここが一番簡潔でわかりやすい  
https://qiita.com/tktktks10/items/c78fe6f2083611676fbb  
引数ありはここを参考にした  

画面遷移  
https://blog.tsuiteikunogayattodaze.net/archives/121  

このサイトでやったら結構環境が違うところが多くてハマった
https://qiita.com/tktktks10/items/7df56b4795d907a4cd31  
