package com.example.ryucaptain.growplants;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;

public class InfoTomato extends AppCompatActivity {

    ExpandableListView listMain;

    private ArrayList<String > arrayGroup=new ArrayList<String>();
    private HashMap<String,ArrayList<String>> arrayChild=new HashMap<String, ArrayList<String>>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_tomato);

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
            "토마토의 유래",
            "과일? 채소?",
            "효능",
            "파란색? 빨간색?",
            "껍질 벗기기",
            "토마토소스 만들기",
            "알루미늄 조리기구는 안돼요!",
            "다이어트"
    };

    static final String[] list_text={
            "토마토는 우리말로 일년감이라 하며, 한자명은 남만시(南蠻枾)라고 한다." +
                    "우리나라에서는 토마토를 처음에는 관상용으로 심었으나 차츰 영양가가 밝혀지고 밭에 재배하여 대중화되었다. " +
                    "요즘은 비닐하우스 재배도 하여 일년 내내 먹을 수 있다. 토마토는 가짓과에 속하는 일년생 반덩굴성 식물열매이며 원산지는 남미 페루이다. " +
                    "16세기 초 콜럼버스(Christopher Columbus)가 신대륙을 발견한 즈음 유럽으로 건너가 스페인과 이탈리아에서 재배되었다. 우리나라에는 19세기 초 일본을 거쳐서 들어왔다고 추정하고 있다. ",

            "토마토가 과일이냐 채소냐 하는 시비가 한때 미국에서 정부와 업자 사이에 논란이 있었다." +
                    "이에 대법원에서 토마토를 채소로서 판결을 내렸다. 어찌됐든 토마토는 과일과 채소의 두 가지 특성을 갖추고 있으며 비타민과 무기질 공급원으로 아주 우수한 식품이다." +
                    "세계적인 장수촌(長壽村)으로 알려진 안데스 산맥 기슭의 빌카밤바(Vilcabamba) 사람들이 토마토를 많이 먹은 덕분으로 장수를 누렸다고 전해 오고 있다.",

            "토마토에 함유되어 있는 성분에는 구연산, 사과산, 호박산, 아미노산, 루틴, 단백질, 당질, 회분, 칼슘, 철, 인, 비타민 A, 비타민 B1, 비타민 B2, 비타민 C, 식이섬유 등이다." +
                    "비타민 C의 경우 토마토 한 개에 하루 섭취 권장량의 절반가량이 들어 있다." +
                    "토마토에는 라이코펜, 베타카로틴 등 항(抗)산화 물질이 많다. 토마토의 빨간색은 카로티노이드라는 물질 때문인데 특히 라이코펜(lycopene)이 주성분이다.",
            "빨간 토마토에는 라이코펜이 7∼12㎎% 들어 있다.",

            "토마토의 껍질을 벗기려면 끓는 물에 잠깐 담갔다가 건져서 찬물에서 벗기면 손쉽게 벗길 수 있다." +
                    "잘 익은 토마토를 껍질을 벗기고 으깨면서 체에 받쳐 졸인 것을 토마토 퓨레라고 한다." +
                    "토마토 퓨레에 소금과 향신료를 조미한 것이 토마토 소스이며 소스를 보다 강하게 조미하고 단맛을 낸 것이 토마토 케첩이다." ,

            " 토마토의 라이코펜과 지용성 비타민은 기름에 익힐 때 흡수가 잘 되므로 기름에 볶아 푹 익혀서 퓨레(채소나 과일의 농축진액) 상태로 만들면 편리하다." +
                    "마늘과 쇠고기를 다져서 올리브유에 볶다가 적포도주를 조금, 그리고 토마토 퓨레를 넣으면 토마토 소스가 된다. " +
                    "토마토 소스에 파스타나 밥을 볶으면 쉽게 맛을 낼 수 있다." ,

            "토마토, 양배추 등 산(酸)이 많은 식품을 조리할 때는 단시간에 조리하거나 스테인리스 스틸 재질의 조리 기구를 사용해야 한다." +
                    "알루미늄제 조리 기구를 사용하게 되면 알루미늄 성분이 녹아 나올 수 있기 때문이다." +
                    "세계보건기구(WHO)는 지난 1997년 알루미늄에 대해 신체 과다 노출 시 구토, 설사, 메스꺼움 등을 유발할 수 있다고 경고한 바 있다.",

            "토마토 1개(200g)의 열량은 35㎉에 불과하며 수분과 식이섬유가 많아 포만감을 준다." +
                    "이에 식사 전에 토마토를 한 개 먹으면 식사량을 줄일 수 있으며, 소화도 돕고 신진대사를 촉진하는 효과도 있다.\n" +
                    "토마토는 끓이거나 으깨면 체내에서 영양 성분이 더 잘 흡수되므로 다양한 요리법을 응용할 수 있다." +
                    "토마토 수프, 토마토 샐러드, 토마토 피자, 토마토 베이글 샌드위치, 해물 토마토찜 등은 맛도 좋고 몸에도 좋은 토마토 요리이다." +
                    "또한 토마토를 올리브유, 우유 등과 함께 먹으면 영양소의 체내 흡수력을 높여 주므로 더욱 좋다." ,
    };
}
