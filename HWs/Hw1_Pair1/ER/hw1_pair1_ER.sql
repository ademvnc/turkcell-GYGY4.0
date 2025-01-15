-- customer_type table
CREATE TABLE customer_type (
    id SERIAL PRIMARY KEY,
    type_name VARCHAR(50)
);

-- segment table
CREATE TABLE segment (
    id SERIAL PRIMARY KEY,
    segment_name VARCHAR(50)
);

-- customer table
CREATE TABLE customer (
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address TEXT,
    contact JSONB,
    id_number VARCHAR(20),
    type_id INT REFERENCES customer_type(id),
    segment_id INT REFERENCES segment(id)
);

-- plan_type table
CREATE TABLE plan_type (
    id SERIAL PRIMARY KEY,
    plan_type_name VARCHAR(50)
);

-- payment_method table
CREATE TABLE payment_method (
    id SERIAL PRIMARY KEY,
    payment_method_name VARCHAR(50)
);

-- subscription table
CREATE TABLE subscription (
    id SERIAL PRIMARY KEY,
    customer_id INT REFERENCES customer(id),
    plan_type_id INT REFERENCES plan_type(id),
    billing_cycle VARCHAR(20),
    payment_method_id INT REFERENCES payment_method(id),
    start_date DATE,
    end_date DATE,
    is_active BOOLEAN
);

-- invoices table
CREATE TABLE invoices (
    id SERIAL PRIMARY KEY,
    subscription_id INT REFERENCES subscription(id),
    creation_date DATE,
    due_date DATE,
    amount NUMERIC(10, 2),
    payment_date DATE,
    late_fee NUMERIC(10, 2),
    discount NUMERIC(10, 2)
);

-- request_category table
CREATE TABLE request_category (
    id SERIAL PRIMARY KEY,
    category_name VARCHAR(50)
);

-- request_status table
CREATE TABLE request_status (
    id SERIAL PRIMARY KEY,
    status_name VARCHAR(50)
);

-- support_request table
CREATE TABLE support_request (
    id SERIAL PRIMARY KEY,
    customer_id INT REFERENCES customer(id),
    category_id INT REFERENCES request_category(id),
    status_id INT REFERENCES request_status(id),
    customer_representative_id INT,
    description VARCHAR(500)
);

-- role table
CREATE TABLE role (
    id SERIAL PRIMARY KEY,
    role_name VARCHAR(50)
);

-- permission table
CREATE TABLE permission (
    id SERIAL PRIMARY KEY,
    description VARCHAR(200)
);

-- user table
CREATE TABLE "user" (
    id SERIAL PRIMARY KEY,
    role_id INT REFERENCES role(id)
);

-- log table
CREATE TABLE log (
    id SERIAL PRIMARY KEY,
    user_id INT REFERENCES "user"(id),
    description VARCHAR(200)
);

-- role_permission table
CREATE TABLE role_permission (
    id SERIAL PRIMARY KEY,
    role_id INT REFERENCES role(id),
    permission_id INT REFERENCES permission(id)
);

-- product_service_type table
CREATE TABLE product_service_type (
    id SERIAL PRIMARY KEY,
    type_name VARCHAR(50)
);

-- product_service table
CREATE TABLE product_service (
    id SERIAL PRIMARY KEY,
    type_id INT REFERENCES product_service_type(id),
    stock INT,
    price NUMERIC(10, 2)
);

-- campaign table
CREATE TABLE campaign (
    id SERIAL PRIMARY KEY,
    segment_id INT REFERENCES segment(id),
    start_date DATE,
    end_date DATE,
    performance_report TEXT
);

-- campaign_product_service table
CREATE TABLE campaign_product_service (
    id SERIAL PRIMARY KEY,
    campaign_id INT REFERENCES campaign(id),
    product_service_id INT REFERENCES product_service(id)
);

-- promotion table
CREATE TABLE promotion (
    id SERIAL PRIMARY KEY,
    detail VARCHAR(500),
    start_date DATE,
    end_date DATE
);

-- promotion_product_service table
CREATE TABLE promotion_product_service (
    id SERIAL PRIMARY KEY,
    promotion_id INT REFERENCES promotion(id),
    product_service_id INT REFERENCES product_service(id)
);

-- complaint_status table
CREATE TABLE complaint_status (
    id SERIAL PRIMARY KEY,
    status_name VARCHAR(50)
);

-- complaint_type table
CREATE TABLE complaint_type (
    id SERIAL PRIMARY KEY,
    type_name VARCHAR(50)
);

-- complaint table
CREATE TABLE complaint (
    id SERIAL PRIMARY KEY,
    customer_id INT REFERENCES customer(id),
    type_id INT REFERENCES complaint_type(id),
    status_id INT REFERENCES complaint_status(id),
    actions TEXT
);

-- report_type table
CREATE TABLE report_type (
    id SERIAL PRIMARY KEY,
    type_name VARCHAR(50)
);

-- analytics table
CREATE TABLE analytics (
    id SERIAL PRIMARY KEY,
    report_type INT REFERENCES report_type(id),
    report TEXT
);

-- notification_type table
CREATE TABLE notification_type (
    id SERIAL PRIMARY KEY,
    type_name VARCHAR(50)
);

-- message_type table
CREATE TABLE message_type (
    id SERIAL PRIMARY KEY,
    type_name VARCHAR(50)
);

-- notification table
CREATE TABLE notification (
    id SERIAL PRIMARY KEY,
    notification_type INT REFERENCES notification_type(id),
    message_type INT REFERENCES message_type(id),
    customer_id INT REFERENCES customer(id),
    content TEXT,
    sent_at DATE
);
--Insertion
-- customer_type tablosu için veri ekleme
INSERT INTO customer_type (type_name) VALUES ('Bireysel'), ('Kurumsal');

-- segment tablosu için veri ekleme
INSERT INTO segment (segment_name) VALUES ('VIP'), ('Premium'), ('Standart');

-- customer tablosu için veri ekleme
INSERT INTO customer (first_name, last_name, address, contact, id_number, type_id, segment_id)
VALUES
('Ahmet', 'Yılmaz', 'İstanbul, Beşiktaş', '{"telefon": "5551234567", "email": "ahmet.yilmaz@example.com"}', '12345678901', 1, 1),
('Mehmet', 'Kaya', 'Ankara, Çankaya', '{"telefon": "5559876543", "email": "mehmet.kaya@example.com"}', '23456789012', 2, 2),
('Zeynep', 'Demir', 'İzmir, Karşıyaka', '{"telefon": "5321112233", "email": "zeynep.demir@example.com"}', '34567890123', 1, 3);

-- plan_type tablosu için veri ekleme
INSERT INTO plan_type (plan_type_name) VALUES ('Mobil Paket'), ('İnternet'), ('TV Paketi');

-- payment_method tablosu için veri ekleme
INSERT INTO payment_method (payment_method_name) VALUES ('Kredi Kartı'), ('Banka Transferi'), ('Otomatik Ödeme');

-- subscription tablosu için veri ekleme
INSERT INTO subscription (customer_id, plan_type_id, billing_cycle, payment_method_id, start_date, end_date, is_active)
VALUES
(1, 1, 'Aylık', 1, '2024-01-01', '2024-12-31', TRUE),
(2, 2, '3 Aylık', 2, '2024-02-01', '2024-11-30', TRUE),
(3, 3, 'Yıllık', 3, '2024-03-01', '2025-02-28', FALSE);

-- invoices tablosu için veri ekleme
INSERT INTO invoices (subscription_id, creation_date, due_date, amount, payment_date, late_fee, discount)
VALUES
(1, '2024-01-01', '2024-01-10', 200.00, '2024-01-05', 0.00, 20.00),
(2, '2024-04-01', '2024-04-10', 600.00, NULL, 10.00, 0.00),
(3, '2024-03-01', '2024-03-10', 1200.00, '2024-03-15', 50.00, 100.00);

-- request_category tablosu için veri ekleme
INSERT INTO request_category (category_name) VALUES ('Teknik Destek'), ('Fatura Sorunu'), ('Yeni Abonelik Talebi');

-- request_status tablosu için veri ekleme
INSERT INTO request_status (status_name) VALUES ('Açık'), ('Çözüldü'), ('Beklemede');

-- support_request tablosu için veri ekleme
INSERT INTO support_request (customer_id, category_id, status_id, customer_representative_id, description)
VALUES
(1, 1, 1, 101, 'İnternet bağlantısı kesildi.'),
(2, 2, 3, 102, 'Yanlış fatura tutarı.'),
(3, 3, 2, 103, 'Yeni TV paketi talebi onaylandı.');

-- role tablosu için veri ekleme
INSERT INTO role (role_name) VALUES ('Müşteri Temsilcisi'), ('Teknik Destek Uzmanı'), ('Yönetici');

-- permission tablosu için veri ekleme
INSERT INTO permission (description) VALUES ('Müşteri Kaydı Görüntüleme'), ('Fatura Düzenleme'), ('Destek Talebi Yönetimi');

-- user tablosu için veri ekleme
INSERT INTO "user" (role_id) VALUES (1), (2), (3);

-- log tablosu için veri ekleme
INSERT INTO log (user_id, description) VALUES (1, 'Müşteri bilgisi güncellendi.'), (2, 'Fatura oluşturuldu.');

-- product_service_type tablosu için veri ekleme
INSERT INTO product_service_type (type_name) VALUES ('Mobil Cihaz'), ('Modem'), ('TV Paketi');

-- product_service tablosu için veri ekleme
INSERT INTO product_service (type_id, stock, price) VALUES
(1, 50, 5000.00),
(2, 100, 250.00),
(3, 20, 200.00);

-- campaign tablosu için veri ekleme
INSERT INTO campaign (segment_id, start_date, end_date, performance_report)
VALUES (1, '2024-05-01', '2024-06-30', 'VIP segmentte %30 satış artışı.');

-- campaign_product_service tablosu için veri ekleme
INSERT INTO campaign_product_service (campaign_id, product_service_id)
VALUES (1, 1), (1, 3);

-- promotion tablosu için veri ekleme
INSERT INTO promotion (detail, start_date, end_date) VALUES
('Yaz indirimi - Tüm TV paketlerinde %10 indirim.', '2024-06-01', '2024-08-31');

-- promotion_product_service tablosu için veri ekleme
INSERT INTO promotion_product_service (promotion_id, product_service_id)
VALUES (1, 3);

-- complaint_status tablosu için veri ekleme
INSERT INTO complaint_status (status_name) VALUES ('Beklemede'), ('Çözüldü'), ('Reddedildi');

-- complaint_type tablosu için veri ekleme
INSERT INTO complaint_type (type_name) VALUES ('Teknik'), ('Müşteri Hizmetleri'), ('Fatura');

-- complaint tablosu için veri ekleme
INSERT INTO complaint (customer_id, type_id, status_id, actions)
VALUES
(1, 1, 1, 'Teknik ekip yönlendirildi.'),
(2, 2, 2, 'Müşteri hizmetleri problemi çözdü.');

-- notification_type tablosu için veri ekleme
INSERT INTO notification_type (type_name) VALUES ('Fatura Bildirimi'), ('Kampanya Duyurusu');

-- message_type tablosu için veri ekleme
INSERT INTO message_type (type_name) VALUES ('SMS'), ('E-posta');

-- notification tablosu için veri ekleme
INSERT INTO notification (notification_type, message_type, customer_id, content, sent_at)
VALUES
(1, 1, 1, 'Son ödeme tarihi yaklaşan faturanız bulunmaktadır.', '2024-07-01'),
(2, 2, 2, 'Yaz kampanyamız başladı!', '2024-07-15');
