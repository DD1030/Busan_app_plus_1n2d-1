package com.example.busanapp.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.busanapp.Course.Course_busan_1n2d1;
import com.example.busanapp.Course.RecyclerViewAdapter_busan_1n2d1;
import com.example.busanapp.R;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    private ImageAdapter adapter = new ImageAdapter();
    private RecyclerView recyclerView;
    //추가
    List<Course_busan_1n2d1> first_Course;


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        /*LinearLayoutManager horizonalLayoutManager = new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false);

        recyclerView.setLayoutManager(horizonalLayoutManager);
        recyclerView.setAdapter(adapter);

        adapter.setItems(new ImageData().getItems());*/


        //course
//사진 추가 할 때마다 설명 늘리면 됨
        first_Course = new ArrayList<>();
        first_Course.add(new Course_busan_1n2d1("1박 2일에 완성하는 부산 해안선 완전 정복!", "1박 2일 여행",
                        "추천코스",

                        "\n" +
                        "1일차 : 영도대교 - 흰여울문화마을 / 절영해안산책로 - 태종대 - 국제시장/깡통시장 - 용두산공원\n\n" +
                        "2일차 : 해운대해수욕장 - 아쿠아리움 - 동백해안산책로(누리마루APEC하우스) - 오륙도스카이워크 - 이기대해안산책로 - 광안대교\n",

                        "영도대교에서 여정을 시작한다.\n" +
                        "영도로 향하는 관문인 영도대교는 1950년대 한국전쟁으로 인해 생이별한 가족들이 훗날 만남을 기약하던 유명한 다리였다.\n" +
                        "한국 최초의 도개교로 매일 오후 2시 도개행사가 열린다.\n ",

                        "흰여울문화마을과 마을 아래 절영해안산책로에서는 영화촬영 장소 찾기, 아기자기한 카페 구경하기, 바다 전망 인생샷 찍기 등으로 매번 분주하다.\n ",

                        "영도에 왔다면 뛰어난 해안절경을 자랑하는 태종대도 놓쳐서는 안 된다. " +
                        "맑은 날 전망대에 오르면 대마도까지 조망할 수 있고 다누비열차를 이용해 태종대 전체를 편하게 둘러볼 수 있다.\n",

                        "국제시장은 영화로 만들어질 만큼 전쟁의 슬픈 역사가 남아 있는 곳이다. 다양한 구제 물품과 수입품을 저렴한 가격에 구매할 수 있다.\n "+
                        "시간 가는 줄 모르고 시장 구경을 하다 허기가 지면 인근 깡통시장으로 걸음을 옮겨보자. 맛도 가격도 착한 주전부리의 진수가 기다리고 있다.\n",

                        "국제시장에서 도보로 10분 거리에 용두산 공원이 자리해 있다. 부산 랜드마크인 부산타워 전망대는 일몰시간이면 최고의 전망을 자랑한다.\n " +
                        "땅거미가 지기 시작하면 노을에 붉게 빛나는 부산항, 영도, 남포동, 국제시장 등이 파노라마처럼 한눈에 들어온다.\n " +
                        "해가 진 후, 환상적 야경을 눈에 담으며 첫째 날을 마무리한다.\n\n",

                        "해운대에서 시작하는 여행 2일차.\n " +
                        "우리나라 대표 관광지이자 많은 인파가 찾는 곳인 만큼 주변에는 숙박 시설과 오락 시설들이 잘 조성돼 있다. \n",

                        "부산 대표 실내관광명소인 부산아쿠아리움에서는 살아 있는 다양한 해양생물들을 직접 눈으로 볼 수 있으며, 시간대별로 다양한 수중 공연이 펼쳐진다.\n ",

                        "숲과 바다가 어우러진 명품 해안산책로 동백섬이다.\n\n " +
                        //내용전환
                        "해운대 해변 끝자락에서 시작해 누리마루APEC하우스를 거쳐 더베이101으로 이어지는 코스로 이동하거나 또는 그 반대 방향으로 코스를 잡아도 좋다.\n " +
                        "하얀 등대가 반기는 전망대에서 시원한 부산 앞바다와 웅장한 광안대교를 한눈에 조망할 수 있다.\n\n",

                        "부산의 아름다운 일출과 일몰을 모두 가진 명소 오륙도다. 해맞이공원과 스카이워크에서 만나는 에메랄드 빛 부산 앞바다가 아름다운 곳이다.\n " +
                        "투명 유리바닥 스카이워크에서의 짜릿한 경험은 오륙도가 선사하는 또 다른 즐거움이다.\n ",

                        "오륙도는 이기대 해안산책로로 이어진다. " +
                        "오르락 내리락 경사가 있는 트레킹 코스긴 하지만 해안을 따라 걷는 길이 보여주는 멋진 경관을 놓칠 수는 없다.\n\n",

                        "★추천코스★",
                        "\n\n젊음의 열기가 넘쳐나는 도심 속 바다 광안리해수욕장에서 여유 있게 휴식을 취한다. \n" +
                                "해가 지면 나타나는 다이아몬드브릿지 광안대교는 10만 가지 이상의 LED가 만들어내는 황홀한 불빛으로 광안리 해변을 물들인다.\n" +
                                "\n" +
                                "부산의 해안선을 따라가는 여행, 부산 바다가 간직한 여러 얼굴을 만나러 가는 길은 1박 2일이라는 시간이 결코 아깝지 않다."

                ,R.drawable.busan_1n2d,R.drawable.busan_1n2d_first,R.drawable.busan_1n2d_second,R.drawable.busan_1n2d_third,R.drawable.busan_1n2d_fourth,
                R.drawable.busan_1n2d_fifth,R.drawable.busan_1n2d_sixth,R.drawable.busan_1n2d_seventh,R.drawable.busan_1n2d_eighth,R.drawable.busan_1n2d_ninth
                ,R.drawable.busan_1n2d_tenth,R.drawable.busan_1n2d_eleventh));









        // 2번째 코스
        //first_Course.add(new Course("부산 1박 2일 밤도깨비 여행 코스", "여행코스", "조사", R.drawable.third));

        RecyclerView myrv = view.findViewById(R.id.recyclerView);

        RecyclerView.Adapter myAdapter = new RecyclerViewAdapter_busan_1n2d1(getActivity(), first_Course);

        //myrv.setLayoutManager(new GridLayoutManager(this, 3));

        // 가로 레이아웃
        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false);

        // 레이아웃 매니저 연결
        myrv.setLayoutManager(horizontalLayoutManager);

        myrv.setAdapter(myAdapter);

        return view;
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

}

