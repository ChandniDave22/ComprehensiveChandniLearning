import pytest
from selenium import webdriver
from selenium.webdriver.common.by import By


@pytest.fixture(scope="class")
def chrome_driver_init(request):
    chrome_driver = webdriver.Chrome()
    request.cls.driver = chrome_driver
    yield
    chrome_driver.close()


@pytest.mark.usefixtures("chrome_driver_init")
class Test_URL_Chrome():
    def test_url_w3_school_logo(self):
        self.driver.get('https://www.w3schools.com/')
        self.driver.maximize_window()
        self.driver.find_element(By.CSS_SELECTOR, "i.fa.fa-logo.ws-hover-text-green")