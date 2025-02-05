package huangshun.it.com.androiddesignpattern.play.presenter;

import huangshun.it.com.androiddesignpattern.play.bean.PageBean;
import huangshun.it.com.androiddesignpattern.play.data.RecommendModel;
import huangshun.it.com.androiddesignpattern.play.presenter.contract.RecommendContract;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by hs on 2017/8/5.
 */

public class RecommendPresenter extends BasePresenter<RecommendModel, RecommendContract.view> {

    public RecommendPresenter(RecommendModel model, RecommendContract.view view) {
        super(model, view);
    }


    public void getResult() {
        mView.showLoading();
        mModel.getApps(new Callback<PageBean>() {
            @Override
            public void onResponse(Call<PageBean> call, Response<PageBean> response) {
                if (response.isSuccessful() && response.body().getDatas() != null) {
                    mView.displayView(response.body().getDatas());
                } else {
                    mView.showNoData();
                }
                mView.dismissLoading();
            }

            @Override
            public void onFailure(Call<PageBean> call, Throwable t) {
                mView.dismissLoading();
                mView.showError(t.getMessage());
            }
        });
    }
}
