package com.thebluealliance.androidclient;

import com.thebluealliance.androidclient.di.DaggerMockApplicationComponent;
import com.thebluealliance.androidclient.di.DaggerMockDatafeedComponent;
import com.thebluealliance.androidclient.di.DaggerMockDbComponent;
import com.thebluealliance.androidclient.di.DaggerMockNotificationComponent;
import com.thebluealliance.androidclient.di.MockAccountModule;
import com.thebluealliance.androidclient.di.MockApplicationComponent;
import com.thebluealliance.androidclient.di.MockAuthModule;
import com.thebluealliance.androidclient.di.MockBinderModule;
import com.thebluealliance.androidclient.di.MockDatabaseWriterModule;
import com.thebluealliance.androidclient.di.MockDatafeedComponent;
import com.thebluealliance.androidclient.di.MockDatafeedModule;
import com.thebluealliance.androidclient.di.MockDbComponent;
import com.thebluealliance.androidclient.di.MockGceModule;
import com.thebluealliance.androidclient.di.MockGcmModule;
import com.thebluealliance.androidclient.di.MockHttpModule;
import com.thebluealliance.androidclient.di.MockNotificationComponent;
import com.thebluealliance.androidclient.di.MockRendererModule;
import com.thebluealliance.androidclient.di.MockTbaAndroidModule;

public class TestTbaAndroid extends TbaAndroid {

    private MockApplicationComponent mComponent;
    private MockTbaAndroidModule mModule;
    private MockDatafeedModule mDatafeedModule;
    private MockBinderModule mBinderModule;
    private MockDatabaseWriterModule mDatabaseWriterModule;
    private MockAccountModule mMockAccountModule;
    private MockAuthModule mMockAuthModule;
    private MockGcmModule mMockGcmModule;
    private MockGceModule mMockGceModule;
    private MockHttpModule mMockHttpModule;

    @Override
    public void onCreate() {
        disableStetho();
        super.onCreate();
    }

    public MockTbaAndroidModule getMockModule() {
        if (mModule == null) {
            mModule = new MockTbaAndroidModule();
        }
        return mModule;
    }

    public MockDatafeedModule getMockDatafeedModule() {
        if (mDatafeedModule == null) {
            mDatafeedModule = new MockDatafeedModule();
        }
        return mDatafeedModule;
    }

    public MockBinderModule getMockBinderModule() {
        if (mBinderModule == null) {
            mBinderModule = new MockBinderModule(getApplicationContext());
        }
        return mBinderModule;
    }

    public MockDatabaseWriterModule getMockDatabaseWriterModule() {
        if (mDatabaseWriterModule == null) {
            mDatabaseWriterModule = new MockDatabaseWriterModule();
        }
        return mDatabaseWriterModule;
    }

    public MockAccountModule getMockAccountModule() {
        if (mMockAccountModule == null) {
            mMockAccountModule = new MockAccountModule();
        }
        return mMockAccountModule;
    }

    public MockAuthModule getMockAuthModule() {
        if (mMockAuthModule == null) {
            mMockAuthModule = new MockAuthModule();
        }
        return mMockAuthModule;
    }

    public MockGceModule getMockGceModule() {
        if (mMockGceModule == null) {
            mMockGceModule = new MockGceModule();
        }
        return mMockGceModule;
    }

    public MockGcmModule getMockGcmModule() {
        if (mMockGcmModule == null) {
            mMockGcmModule = new MockGcmModule();
        }
        return mMockGcmModule;
    }

    public MockHttpModule getMockHttpModule() {
        if (mMockHttpModule == null) {
            mMockHttpModule = new MockHttpModule();
        }
        return mMockHttpModule;
    }

    public MockApplicationComponent getMockComponent() {
        if (mComponent == null) {
            mComponent = DaggerMockApplicationComponent.builder()
                    .mockTbaAndroidModule(getMockModule())
                    .build();
        }
        return mComponent;
    }

    public MockDbComponent getMockDbComponent() {
        return DaggerMockDbComponent.builder()
                .mockTbaAndroidModule(getMockModule())
                .mockHttpModule(getMockHttpModule())
                .build();
    }

    public MockNotificationComponent getMockNotificationComponent() {
        return  DaggerMockNotificationComponent.builder()
                .mockApplicationComponent(getMockComponent())
                .mockDatafeedModule(getMockDatafeedModule())
                .mockRendererModule(new MockRendererModule())
                .mockAuthModule(getMockAuthModule())
                .mockGcmModule(getMockGcmModule())
                .build();
    }

    private MockDatafeedComponent getMockDatafeedComponenet() {
        return DaggerMockDatafeedComponent.builder()
                .mockApplicationComponent(getMockComponent())
                .mockDatafeedModule(getMockDatafeedModule())
                .build();
    }
}
