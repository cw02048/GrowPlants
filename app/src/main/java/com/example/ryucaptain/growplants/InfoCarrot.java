package com.example.ryucaptain.growplants;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;

public class InfoCarrot extends AppCompatActivity {

    ExpandableListView listMain;

    private ArrayList<String > arrayGroup=new ArrayList<String>();
    private HashMap<String,ArrayList<String>> arrayChild=new HashMap<String, ArrayList<String>>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_carrot);

        listMain = (ExpandableListView) this.findViewById(R.id.exlist);
        setArrayData();
        listMain.setAdapter(new AdptMain(this, arrayGroup, arrayChild));
    }

    private void setArrayData(){
        for(int i=0;i<8;i++){
            arrayGroup.add(list_menu[i].toString());
        }
        ArrayList<String> array_text1=new ArrayList<String>();
        array_text1.add(list_text[0].toString());

        ArrayList<String> array_text2=new ArrayList<String>();
        array_text2.add(list_text[1].toString());

        ArrayList<String> array_text3=new ArrayList<String>();
        array_text3.add(list_text[2].toString());

        ArrayList<String> array_text4=new ArrayList<String>();
        array_text4.add(list_text[3].toString());

        ArrayList<String> array_text5=new ArrayList<String>();
        array_text5.add(list_text[4].toString());

        ArrayList<String> array_text6=new ArrayList<String>();
        array_text6.add(list_text[5].toString());

        ArrayList<String> array_text7=new ArrayList<String>();
        array_text7.add(list_text[6].toString());

        ArrayList<String> array_text8=new ArrayList<String>();
        array_text8.add(list_text[7].toString());

        arrayChild.put(arrayGroup.get(0),array_text1); arrayChild.put(arrayGroup.get(4),array_text5);
        arrayChild.put(arrayGroup.get(1),array_text2); arrayChild.put(arrayGroup.get(5),array_text6);
        arrayChild.put(arrayGroup.get(2),array_text3); arrayChild.put(arrayGroup.get(6),array_text7);
        arrayChild.put(arrayGroup.get(3),array_text4); arrayChild.put(arrayGroup.get(7),array_text8);
    }

    static final String[] list_menu={
            "당근에 대해서",
            "좋은 당근 고르는 법",
            "당근 재배방법",
            "당근의 효능",
            "당근 손질법",
            "당근 보관방법",
            "당근을 활용한 요리",
            "당근의 다이어트 효과"
    };

    static final String[] list_text={
            " 당근에 대해서 \n\n" +
                    "아프가니스탄이 원산지이고, 유럽에는 10∼13세기에 아랍 지역으로부터 들어왔으며, 중국에는 13세기 말 원나라 초기에 중앙아시아로부터 들어왔다." +
                    "한국에서는 16세기부터 재배하기 시작했다. 한방에서는 당근 뿌리를 학슬풍(鶴 風)이라는 약재로 쓰는데, 이질, 백일해, 해수, 복부팽만에 효과가 있고 구충제로도 사용한다.",

            "좋은 당근 고르는 법 \n\n" +
                    "색깔은 주황색이 선명하고 진할수록 영양소가 풍부한 것이다." +
                    "표면이 매끈한 것이 단맛이 강하며, 모양은 단단하면서 휘지 않은 것을 고르는데, 간혹 머리 부분이 푸른빛이 난다면 햇볕에 오래 노출되어 쓴맛이 날 수 있으므로 피하는 것이 좋다.",

            "당근 재배방법 \n\n" +
                    "당근은 45-60cm 간격으로 작은 씨를 심어 재배한다." +
                    "토양은 겉흙이 깊고, 물빠짐이 좋으며, 모래나 거름을 포함한 기름진 것이 제일 좋다." +
                    "당근은 추운 겨울에도 살아남을 수 있으며 여름철의 심한 더위도 잘 이겨낸다.",

            "당근의 효능 \n\n " +
                    "당근에 풍부하게 함유된 베타카로틴은 항산화 효과를 내고, 노화 방지 및 암 예방에 도움을 준다." +
                    "루테인, 리코펜 성분이 풍부하여 눈 건강에 효능이 있으며 면역력 향상, 고혈압, 동맥경화를 예방해준다. 카로틴과 비타민A가 풍부한 당근은 비타민C와 칼륨 함량이 높은 사과와 함께 섭취하면 좋다." +
                    "지용성 비타민이므로 기름에 볶아 섭취하면 비타민 섭취를 높여준다.",

            "당근 손질법 \n\n" +
                    "당근을 흐르는 물에 깨끗이 씻어내 흙과 불순물을 제거한다." +
                    "껍질은 필러로 벗겨서 사용할 수 있지만, 베타카로틴이 풍부하기 때문에 껍질째 먹는 것이 더 좋다." +
                    "당근의 줄기가 붙어있던 윗부분을 칼로 제거해준 후 채소 세척용 솔로 껍질을 문질러가면서 씻으면 껍질을 먹을 수 있을 만큼 깨끗하게 손질할 수 있다." +
                    "당근은 오래 가열하면 조직이 물러지기 때문에 찜이나 조림 요리를 할 때는 당근의 모서리를 둥글게 깎아서 부서지지 않도록 하는 것이 좋다." ,

            "당근 보관 벙법 \n\n" +
                    " 당근은 다른 채소에 비해 장기 보관이 가능하다. 표면의 흙을 깨끗이 씻어서 물기를 제거한 후 밀봉하여 냉장 보관하거나, 흙이 묻은 채로 신문지에 싸서 그늘지고 서늘한 곳에 보관하면 좋다." +
                    "당근을 잘라서 쓰고 나머지를 다시 보관해야 할 때는 자른 단면에 물을 뿌린 후 랩으로 잘 밀봉하여 냉장고에 보관하면 시들지 않아 다시 사용하기 좋다.",

            "당근 요리 \n\n" +
                    " 당근 케이크, 당근 칩, 당근 주스, 당근 푸딩, 당근 샐러드, 마르코프차, 당근수프, 당근유",

            "당근의 다이어트 효과 \n\n" +
                    "펙틴이라는 성분은 식물성 섬유로 위장이 좋지않은 사람이 섭취했을 때 소화로 인해 더부룩함을 없애주고 배변을 도와준다." +
                    "당근에는 다양한 종류의 비타민이 균형있게 들어있어 피부에 비타민을 공급하고 철분은 혈액의 흐름을 원활하게 해 나쁜 노폐물을 체외로 배출할 수 있게 해준다. ",

    };

}
