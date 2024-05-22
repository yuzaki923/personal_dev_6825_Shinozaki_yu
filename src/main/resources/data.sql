-- カテゴリーテーブルデータ
INSERT INTO categories(name) VALUES('本');
INSERT INTO categories(name) VALUES('DVD');
INSERT INTO categories(name) VALUES('ゲーム');
-- 商品テーブルデータ
INSERT INTO items(photo, comm, category_id, name, price) VALUES('TR7U-00000_hero_600_450.jpg', 'これを買う前まではカチカチのマットレスで寝ていたが、ふかふかすぎて感動した。<br>低反発マットレスと枕のセットだが、寝心地触り心地ともども最高で寝起きも心なしかいい気がする。<br>',1, 'ニトリ:寝具セット', 23978);
INSERT INTO items(photo, comm, category_id, name, price) VALUES('517wdm6rhhL.__AC_SY445_SX342_QL70_ML2_.jpg', '冬場のめちゃくちゃ寒い日に、すでにぽかぽか担っている布団に潜るのは最高であるということを知れた。<br>それ以外でも部屋を暖めたり直接熱を浴びてもよい。正規の使い方とは違うが、乾いていない靴下をはめるとすぐに乾いてくれて時々助かる。<br>靴を乾かしたりもできるようだが、特にしたことはない。',1, 'アイリスオーヤマ布団乾燥機', 11950);
INSERT INTO items(photo, comm, category_id, name, price) VALUES('slide_1.jpg', '部屋にソファーを置くことが夢だったため、自分の部屋において初めてもたれかかった時の感動を今でも覚えている。<br>少し奮発して買ったソファーであり、座り心地も最高。足を延ばして寝転がることができるサイズなので、もちろん寝ることもできる。',1,'ニトリ：ソファー', 53579);
INSERT INTO items(photo, comm, category_id, name, price) VALUES('41r3XxK+hcL._AC_SY300_SX300_.jpg', 'これを買う前は安い炊飯器を使っていたが、保温していてもすぐに固くなるし、お手入れも少々面倒だった。<br>この炊飯器は圧力IHで炊くもので、非常にふっくらおいしく仕上がる。なにより時間がたってもほとんど劣化しないということに驚いた。<br>変わらずにずっとおいしい。また洗う際ぜんぜんお釜に米がこびりつかないので、非常に洗いやすいのも好きなポイント。',2,'パナソニック炊飯器', 25200);
INSERT INTO items(photo, comm, category_id, name, price) VALUES('ダウンロード.jpg', '一年間で10本くらい新たにゲームをプレイしたが、これが一番よかった。死んだことになっている桐生一馬が、本筋の外で何をしていたのが語られる。<br>魅力を語ると尽きないが、とにかく感動するし、ゲーム性も面白い良い作品だった。',2,'龍が如く７外伝', 5940);
INSERT INTO items(photo, comm, category_id, name, price) VALUES('1716195198744.jpg', 'そもそも髪型はおろか眉毛など整えなくてもいいだろうぐらいに思っていたが、びっくりするくらい印象が変わると聞いて、<br>面白そうだから足を運んでみた。確かに印象が変わるし綺麗になっていて驚いた。手っ取り早く見た目の印象を変えたいなら間違いなく行くべき。<br>男女問わずおすすめできるので、ぜひ一度それなりの額を出して眉毛サロンに行ってみてほしい。',2,'眉毛サロンでの眉カット', 6500);
INSERT INTO items(photo, comm, category_id, name, price) VALUES('200386.jpg', '安いのにしっかり香る、お気に入りの香水。ほかにもいくつか持っているが、柑橘系で強い匂いでないので、どこでもカジュアルにつけられるのもお気に入りポイント。<br>付けすぎは人によっては気分が悪くなるらしいので、１、２プッシュくらいがちょうどいいと思う。',3,'BODY SHOPの香水', 4000);
INSERT INTO items(photo, comm, category_id, name, price) VALUES('1545004_3L1.jpg', 'お風呂の掃除は基本これ一本で事足りる。',3,'カビキラー', 264);
INSERT INTO items(photo, comm, category_id, name, price) VALUES('61WTVw5s2jL.__AC_SX300_SY300_QL70_ML2_.jpg', '',3,'シークレットインソール', 980);
INSERT INTO items(photo, comm, category_id, name, price) VALUES('71K5b+a7kyL._AC_SY300_SX300_.jpg', '',3,'雑穀米', 980);


INSERT INTO baditems(photo, comm, category_id, name, price) VALUES('61Avn1M5e0L.__AC_SX300_SY300_QL70_ML2_.jpg', 'まず高い。おまけに食器はたいして入らないわ水垢が60％位の確率で<br>食器の底についてるわで最悪。洗い終わった後の皿を<br>また自分で洗うことになることもしばしば。なにより水をいちいちとりかえるのが面倒。<br>シンクがカスすぎてお風呂場で水を汲む度に足が濡れて不愉快極まりない。',1,'パナソニック食洗器', 38000);
INSERT INTO baditems(photo, comm, category_id, name, price) VALUES('189489090920478.webp', 'コストコで買ったもの。それなりの値段を払ったが４回くらいしか使わなかった。<br>挿入して炭酸を入れる容器が大きすぎて、上記同様シンクがカスなので<br>水を入れるのに苦労する。１Lも炭酸を使いきれないし中途半端な<br>量でやるには面倒がすぎる。お酒を飲むように買ったが飲まなくなってしまったのが最大の原因。',1,'ソーダストリーム', 9800);
INSERT INTO baditems(photo, comm, category_id, name, price) VALUES('71tbywixmpl._ac_uf894_1000_ql80_fmwebp_.webp', '首にかけて涼しい風を浴びることができるというもの。中華性というのもあって期待はしてなかったが<br>驚くほど風が弱い。おまけに首に浴びるには少々重いし鬱陶しい。安かったからいいものの<br>二回しか使わず物置行き。アマゾンレビューは星５と星１が多かった。',1,'ネッククーラー', 1980);
INSERT INTO baditems(photo, comm, category_id, name, price) VALUES('81KA4gVoLmL._AC_UF1000,1000_QL80_.jpg', '運動不足解消のために買ったがそもそも運動するスペースがなかった。一度もやらずに物置行き。',1,'リングフィットアドベンチャー', 7473);
INSERT INTO baditems(photo, comm, category_id, name, price) VALUES('71XeYxD1EzL._AC_UF1000,1000_QL80_.jpg', '「友達が来た時に一緒にやるように買おう！」と思って買ったがそもそも友達は来なかった。<br>地元からはなれ川崎のはずれに住んだことと計画性のなさが仇となった。',1,'世界のアソビ遊び大全51-Switch', 3980);