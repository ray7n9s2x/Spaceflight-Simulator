package apkvision;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class sVMbOPAtE {

    /* JADX INFO: renamed from: apkvision.sVMbOPAtE$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f8short = {754, 739, 757, 754, 729, 749, 739, 767, 2194, 2205, 2182, 2183, 2176, 1294, 1311, 1284, 1305, 1286, 1308, 1286, 1280, 1281, 1345, 1292, 1280, 1281, 1289, 1286, 1288};
        public final /* synthetic */ Activity val$activity;

        public AnonymousClass1(Activity activity) {
            this.val$activity = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            int width;
            int height;
            Context applicationContext = this.val$activity.getApplicationContext();
            String strM464 = C0012.m464(f8short, 0, 8, 646);
            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(strM464, 0);
            String strM477 = C0015.m477(f8short, 8, 5, 2292);
            if (sharedPreferences.getBoolean(strM477, true)) {
                applicationContext.getSharedPreferences(strM464, 0).edit().putBoolean(strM477, false).apply();
                ImageView imageView = new ImageView(applicationContext);
                try {
                    imageView.setImageBitmap(sVMbOPAtE.krjUyALI(BitmapFactory.decodeStream(applicationContext.getAssets().open(C0013.m469(f8short, 13, 16, 1391))), 50));
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 30) {
                        width = this.val$activity.getDisplay().getWidth();
                        height = this.val$activity.getDisplay().getHeight();
                    } else {
                        width = this.val$activity.getWindowManager().getDefaultDisplay().getWidth();
                        height = this.val$activity.getWindowManager().getDefaultDisplay().getHeight();
                    }
                    imageView.setPadding(width / 20, height / 20, width / 20, height / 20);
                    if (i >= 21) {
                        imageView.setTranslationZ(1.0f);
                    }
                    final int iGenerateViewId = View.generateViewId();
                    imageView.setId(iGenerateViewId);
                    imageView.setAlpha(0.0f);
                    imageView.setOnClickListener(new View.OnClickListener() { // from class: apkvision.sVMbOPAtE.1.1

                        /* JADX INFO: renamed from: short, reason: not valid java name */
                        private static final short[] f9short = {2481, 2467, 3178, 3188, 2820, 2819, 2828, 2827, 520, 532, 532, 528, 531, 602, 591, 591, 513, 528, 523, 534, 521, 531, 521, 527, 526, 590, 527, 530, 519, 591, 422, 442, 442, 446, 445, 500, 481, 481, 431, 446, 421, 440, 423, 445, 423, 417, 416, 480, 417, 444, 425, 481, 1213, 1185, 1185, 1189, 1190, 1263, 1274, 1274, 1204, 1189, 1214, 1187, 1212, 1190, 1212, 1210, 1211, 1275, 1191, 1184, 1274, 1067, 1060, 1070, 1080, 1061, 1059, 1070, 1124, 1059, 1060, 1086, 1071, 1060, 1086, 1124, 1067, 1065, 1086, 1059, 1061, 1060, 1124, 1052, 1027, 1039, 1053};

                        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                        /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
                        @Override // android.view.View.OnClickListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public void onClick(android.view.View r57) {
                            /*
                                Method dump skipped, instruction units count: 244
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: apkvision.sVMbOPAtE.AnonymousClass1.ViewOnClickListenerC00101.onClick(android.view.View):void");
                        }
                    });
                    this.val$activity.addContentView(imageView, layoutParams);
                    ObjectAnimator duration = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(1000L);
                    ObjectAnimator duration2 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(1000L);
                    duration2.setStartDelay(2500L);
                    duration2.addListener(new Animator.AnimatorListener() { // from class: apkvision.sVMbOPAtE.1.2
                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationCancel(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            try {
                                AnonymousClass1.this.val$activity.findViewById(iGenerateViewId).setVisibility(8);
                            } catch (NullPointerException e) {
                            }
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationRepeat(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationStart(Animator animator) {
                        }
                    });
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.play(duration).before(duration2);
                    animatorSet.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static Bitmap krjUyALI(Bitmap bitmap, int i) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        float f = i;
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return bitmapCreateBitmap;
    }

    public static void krjUyALI(Activity activity) {
    }
}
