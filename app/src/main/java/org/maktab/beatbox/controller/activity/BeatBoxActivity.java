package org.maktab.beatbox.controller.activity;

import androidx.fragment.app.Fragment;

import org.maktab.beatbox.controller.activity.SingleFragmentActivity;
import org.maktab.beatbox.controller.fragment.BeatBoxFragment;
import org.maktab.beatbox.controller.fragment.MusicPlayerFragment;

public class BeatBoxActivity extends SingleFragmentActivity {

    @Override
    public Fragment createFragment() {
//        return BeatBoxFragment.newInstance();
    return MusicPlayerFragment.newInstance();
    }

}